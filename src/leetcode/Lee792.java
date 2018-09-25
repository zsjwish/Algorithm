package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * created by zsj in 15:58 2018/9/25
 * description:给定字符串 S 和单词字典 words, 求 words[i] 中是 S 的子序列的单词个数。
 * 示例:
 * 输入:
 * S = "abcde"
 * words = ["a", "bb", "acd", "ace"]
 * 输出: 3
 * 解释: 有三个是 S 的子序列的单词: "a", "acd", "ace"。
 **/
public class Lee792 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
    }

    public static int numMatchingSubseq(String S, String[] words) {
        int res = 0;
        Set<String> pass = new HashSet<>();
        Set<String> out = new HashSet<>();
        for (String tmp : words) {
            if (pass.contains(tmp) || out.contains(tmp)) {
                if (pass.contains(tmp)) {
                    res++;
                }
                continue;
            }
            else {
                if (isSubsequence(tmp, S)) {
                    pass.add(tmp);
                    res++;
                }
                else {
                    out.add(tmp);
                }
            }
        }
        return res;
    }


    /**
     * s 是 t 的子序列
     * @param s
     * @param t
     * @return
     */
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        if (t.length() == 0) {
            return false;
        }
        int pos = 0;
        for (int i = 0; i < t.length() && pos < s.length(); i++) {
            if (s.charAt(pos) == t.charAt(i)) {
                pos++;
            }
        }
        if (pos == s.length()) {
            return true;
        }
        return false;
    }
}
