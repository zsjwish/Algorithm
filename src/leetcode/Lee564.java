package leetcode;

/**
 * created by zsj in 16:03 2018/5/10
 * description:给定一个整数 n ，你需要找到与它最近的回文数（不包括自身）。
 * “最近的”定义为两个整数差的绝对值最小。.....
 *
 *
 *
 * 没做完，太难了，暂时放下
 **/
public class Lee564 {

    public static void main(String[] args) {
        Lee564 lee564 = new Lee564();
        lee564.nearestPalindromic("12345");
    }

    public String nearestPalindromic(String n) {
        char[] chars = n.toCharArray();
        int length = chars.length;
        if (isPalindromic(n)) {
            if (length % 2 == 1) {
                chars[length/2]-=1;
            }
            else {
                chars[(length-1) / 2] -= 1;
                chars[length / 2] -= 1;
            }
            System.out.println(String.valueOf(chars));
            return String.valueOf(chars);
        }
        int low = 0, high = length - 1;
        while (low < high && !isPalindromic(String.valueOf(chars))) {
            chars[high] = chars[low];
            high--;
            low++;
        }
        System.out.println(String.valueOf(chars));
        return String.valueOf(chars);
    }

    public boolean isPalindromic(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        int low = 0, high = s.length() - 1;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        System.out.println("true");
        return true;
    }

}
