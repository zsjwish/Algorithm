package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 16:53 2018/4/20
 * description:
 **/
public class lee264 {

    public static void main(String[] args) {
        lee264 lee264 = new lee264();
        lee264.nthUglyNumber(15);
    }

    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        int factor2 = 2, factor3 = 3, factor5 = 5;
        for (int i = 1; i < n; i++) {
            int min = Math.min(factor2, Math.min(factor3, factor5));
            ugly[i] = min;
            if (min == factor2) {
                factor2 = 2 * ugly[++index2];
            }
            if (min == factor3) {
                factor3 = 3 * ugly[++index3];
            }
            if (min == factor5) {
                factor5 = 5 * ugly[++index5];
            }
        }
        System.out.println(Arrays.toString(ugly));
        return ugly[n-1];
    }
}
