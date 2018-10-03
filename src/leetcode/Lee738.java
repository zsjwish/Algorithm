package leetcode;

/**
 * created by zsj in 23:34 2018/10/3
 * description:
 * 给定一个非负整数 N，找出小于或等于 N 的最大的整数，同时这个整数需要满足其各个位数上的数字是单调递增。
 * （当且仅当每个相邻位数上的数字 x 和 y 满足 x <= y 时，我们称这个整数是单调递增的。）
 **/
public class Lee738 {
    public static void main(String[] args) {
        System.out.println(monotoneIncreasingDigits(1234));
        System.out.println(monotoneIncreasingDigits(10));
        System.out.println(monotoneIncreasingDigits(963856657));
        System.out.println(monotoneIncreasingDigits(332));
    }

    public static int monotoneIncreasingDigits(int N) {
        char[] arrN = String.valueOf(N).toCharArray();
        int i = 0;
        int index = arrN.length - 1;
        for (i = arrN.length - 1; i > 0; i--) {
            if (arrN[i] < arrN[i-1]) {
                arrN[i-1]--;
                index = i - 1;
            }
        }
        for (int j = index + 1; j < arrN.length; j++) {
            arrN[j] = '9';
        }
        return Integer.parseInt(new String(arrN));
    }

    public static boolean isIncreasingDigit(int N) {
        String s = String.valueOf(N);
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) > s.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }
}
