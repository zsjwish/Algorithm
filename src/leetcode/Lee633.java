package leetcode;

/**
 * created by zsj in 10:40 2018/9/28
 * description:给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
 **/
public class Lee633 {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(18));
        System.out.println(judgeSquareSum(16));
        System.out.println(judgeSquareSum(17));
        System.out.println(judgeSquareSum(3));
        System.out.println(judgeSquareSum(5));
    }

    public static boolean judgeSquareSum(int c) {
        for (int i = 0; i <= Math.sqrt(c); i++) {
            if (isSquNum(c - i*i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSquNum(int n) {
        double d = Math.sqrt(n);
        if (d == (int) d) {
            return true;
        }
        return false;
    }


}
