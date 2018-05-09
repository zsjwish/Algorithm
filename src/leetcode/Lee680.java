package leetcode;

/**
 * created by zsj in 11:01 2018/5/9
 * description:给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 **/
public class Lee680 {

    public static void main(String[] args) {

    }

    public boolean validPalindrome(String s) {
        int low = 0, high = s.length() - 1;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return isPalindrome(s.substring(low+1,high+1)) || isPalindrome(s.substring(low, high));
            }
            low++;
            high--;
        }
        return true;
    }

    public boolean isPalindrome(String s) {
        int low = 0, high = s.length() - 1;
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }

}
