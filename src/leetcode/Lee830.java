package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * created by zsj in 13:41 2018/5/15
 * description:在一串  S 小写字母中，这些字母组成相同字符的连续组。
 * 例如，像绳子S = "abbxxxxzyy"有团体"a"，"bb"，"xxxx"，"z"和  "yy"。
 * 如果它有3个或更多字符，则调用一个较大的组。我们希望每个大集团的开始和结束的位置。
 * 最终答案应该按字典顺序排列。
 * 找出连续出现大于等于三次的字母的下标范围
 **/
public class Lee830 {

    public static void main(String[] args) {
        Lee830 lee830 = new Lee830();
        lee830.largeGroupPositions("abbxxxxzyy");
    }

    public List<List<Integer>> largeGroupPositions(String S) {
        int i = 0, N = S.length();
        List<List<Integer>>res = new LinkedList<>();
        for (int j = 0; j < N; j++) {
            if (j == N-1 || S.charAt(j)!=S.charAt(j+1)) {
                if (j - i + 1 >= 3) {
                    res.add(Arrays.asList(new Integer[]{i,j}));
                }
                i = j+1;
            }
        }
        System.out.println(res);
        return res;
    }

    public List<List<Integer>> largeGroupPositions1(String S) {
        List<List<Integer>> res = new LinkedList<>();
        if (S == null || S.length() <= 2) {
            return res;
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < S.length()-1; i++) {
            if (S.charAt(i+1) != S.charAt(i)) {
                start = i+1;
                end = start;
            }
            else {
                int flag = i;
                while (flag < S.length() - 1 && S.charAt(flag+1) == S.charAt(flag)) {
                    end++;
                    flag++;
                }
                if (end - start >= 2) {
                    List<Integer> tmp = new LinkedList<>();
                    tmp.add(start);
                    tmp.add(end);
                    res.add(tmp);
                    start = end;
                    i = start-1;
                }
            }
        }
        System.out.println(res);
        return res;
    }

}
