package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 16:53 2018/4/20
 * description: 丑数，因子只有2,3,5。1是第一个丑数，求第n个丑数。思路dp。res数组中每个数乘上2,3,5比较大小，最小的放在
 * 结果数组res中，返回第n个数。
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
