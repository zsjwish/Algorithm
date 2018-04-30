package leetcode;

/**
 * created by zsj in 21:20 2018/4/30
 * description:实现 int sqrt(int x) 函数。
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 **/
public class Lee69 {

    public static void main(String[] args) {
        Lee69 lee69 = new Lee69();
        lee69.mySqrt(2147395600);
    }

    public int mySqrt(int x) {
        for (int i = 0; i <= x; i++) {
            long a = (long)i * (long)i;
            long b = (long)(i+1) * (long)(i+1);
            if (a <= x && b > x) {
                return i;
            }
        }
        return 0;
    }

}
