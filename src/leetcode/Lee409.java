package leetcode;

/**
 * created by zsj in 21:17 2018/5/6
 * description:给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 * 思路：遍历所有的字符，找到出现次数大于2的，记录下来，因为回文串一定是偶数次。
 * */
public class Lee409 {

    public static void main(String[] args) {

    }

    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int[] res = new int[128];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                res[s.charAt(i)]++;
            }
        }
        int resNum = 0;
        for (int i = 0; i < res.length; i++) {
            int tmp = res[i];
            if (tmp >= 2) {
                if (tmp % 2 == 1) {
                    resNum += tmp - 1;
                }
                else {
                    resNum += tmp;
                }
            }
        }
        if (resNum == s.length()) {
            return resNum;
        }
        return resNum + 1;
    }

}
