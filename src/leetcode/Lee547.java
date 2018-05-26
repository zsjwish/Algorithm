package leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * created by zsj in 16:00 2018/5/26
 * description:班上有 N 名学生。其中有些人是朋友，有些则不是。他们的友谊具有是传递性。
 * 如果已知 A 是 B 的朋友，B 是 C 的朋友，那么我们可以认为 A 也是 C 的朋友。所谓的朋友圈，是指所有朋友的集合。
 * 给定一个 N * N 的矩阵 M，表示班级中学生之间的朋友关系。如果M[i][j] = 1，表示已知第 i 个和 j 个学生互为朋友关系，
 * 否则为不知道。你必须输出所有学生中的已知的朋友圈总数
 **/
public class Lee547 {
    public static void main(String[] args) {
        Lee547 lee547 = new Lee547();
        lee547.findCircleNum(new int[][]{{1,1,0},{1,1,0},{0,0,1}});
    }

    public int findCircleNum(int[][] M) {
        List<Integer> list = new LinkedList<>();
        Set<List<Integer>> set = new HashSet<>();
        int length = M.length;
        for (int i = 0; i < length; i++) {
            List<Integer> tmp = new LinkedList<>();
            tmp.add(i);
            for (int j = tmp.size()-1; j >= 0; j--) {
                for (int k = 0; k < length; k++) {
                    if (k!=i && M[i][k] == 1) {
                        tmp.add(k);
                    }
                }
                tmp.remove(j);
            }
            list.addAll(tmp);
            set.add(tmp);
        }
        return set.size();
    }
}
