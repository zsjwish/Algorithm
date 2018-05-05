package leetcode;

/**
 * created by zsj in 11:03 2018/5/5
 * description:给定两个字符串 s 和 t，它们只包含小写字母。
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 **/
public class Lee389 {

    public static void main(String[] args) {
        Lee389 lee389 = new Lee389();
        lee389.findTheDifference("abcd", "abcde");
    }

    public char findTheDifference(String s, String t) {
        int[] c1 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            c1[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            c1[t.charAt(i) - 'a']--;
            if (c1[t.charAt(i) - 'a'] < 0) {
                System.out.println(t.charAt(i));
                return t.charAt(i);
            }
        }
        return t.charAt(0);
    }

}
