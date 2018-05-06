package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * created by zsj in 22:22 2018/5/6
 * description:给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。
 * 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。
 **/
public class Lee438 {

    public static void main(String[] args) {
        Lee438 lee438 = new Lee438();
        lee438.findAnagrams("abab", "ab");
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new LinkedList<>();
        if (s == null || s.length() == 0) {
            return res;
        }
        int lenP = p.length();
        for (int i = 0; i < s.length() - lenP; i++) {
            String tmp = s.substring(i, i+lenP);
            if (isAnagrams(p, tmp)) {
                res.add(i);
            }
        }
        System.out.println(res);
        return res;

    }

    public boolean isAnagrams(String a, String b) {
        int[] res = new int[26];
        for (int i = 0; i < a.length(); i++) {
            res[a.charAt(i) - 'a']++;
        }
        for (int i = 0; i < b.length(); i++) {
            res[b.charAt(i) - 'a']--;
            if (res[b.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

}
