package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * created by zsj in 19:15 2018/4/22
 * description:给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合
 * 例如 输入s="a1b2"， 输出["a1b2","A1b2","A1B2","a1B2"]
 * 思路：从最开始给定的字符串开始，放入list中，每次判断位置为i的是否是字符，如果是，先获取list中的size，对于list中的每一个字符串，
 * 把他们切分为两部分，i左边和i右边，分别将第i位的大写字符、小写字符和左边右边重新拼接形成新的字符串放入list表中，如此循环直到最后一个字符
 *
 **/
public class Lee784 {

    public static void main(String[] args) {
        Lee784 lee784 = new Lee784();
        lee784.letterCasePermutation("zsj");
    }

    public List<String> letterCasePermutation(String S) {
        LinkedList<String> res = new LinkedList<>();
        res.add(S);
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (Character.isLetter(c)) {
                for (int j = res.size(); j>0; j--) {
                    String s = res.poll();
                    String left = s.substring(0, i);
                    String right = s.substring(i + 1);
                    res.add(left + Character.toLowerCase(c) + right);
                    res.add(left + Character.toUpperCase(c) + right);
                }
            }
        }
        System.out.println(res);
        return res;
    }

}
