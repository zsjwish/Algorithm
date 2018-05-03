package leetcode;

/**
 * created by zsj in 11:22 2018/5/3
 * description:不使用运算符 + 和-，计算两整数a 、b之和。
 **/
public class Lee371 {

    public static void main(String[] args) {
        Lee371 lee371 = new Lee371();
        System.out.println(lee371.getSum(2,77));
        System.out.println(lee371.getSum1(2,784));
    }

    private int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;


    }

    public int getSum1(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return getSum(sum, carry);
    }
}
