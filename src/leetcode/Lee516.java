package leetcode;

/**
 * created by zsj in 16:55 2018/9/27
 * description:
 **/
public class Lee516 {

    public static void main(String[] args) {
        System.out.println(longestPalindromeSubseq("aaaab"));
    }

    public static int longestPalindromeSubseq(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s.substring(i,j))) {
                    max = Math.max(max, j - i);
                }
            }
        }
        return max;
    }

    public static boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        int low = 0, high = s.length() - 1;
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }

}
