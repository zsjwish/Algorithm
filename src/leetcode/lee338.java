package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 0:16 2018/4/21
 * description:求出一个数的二进制有多少个1，感觉和平方数之和类似（lee279)。只是这个是2的n次方，平方数是n的平方
 * 所以思路类似
 **/
public class lee338 {

    public static void main(String[] args) {
        lee338 lee338 = new lee338();
        lee338.countBits1(5);
    }
    public int[] countBits(int num) {
        if (num < 0) {
            return null;
        }
        int[] dp = new int[num+1];
        if (num == 0) {
            System.out.println(Arrays.toString(dp));
            return dp;
        }
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; Math.pow(2,i) <= num; i++) {
            dp[(int)Math.pow(2,i)] = 1;
        }
        for (int i = 1; i < num; i++) {
            for (int j = 0; i + Math.pow(2, j) <= num; j++) {
                dp[i + (int)Math.pow(2, j)] = Math.min(dp[i + (int)Math.pow(2, j)], dp[i] + 1);
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp;
    }
    //一种更简单的思路，也是dp,一个数的1的个数是它右移一位1的个数加上末尾是否是1。
    //dp[i] = dp[i>>1] + i % 2;因为i就是存放的数字为i的包含的1的个数。
    public int[] countBits1(int num) {
        if (num < 0) {
            return null;
        }
        int[] dp = new int[num + 1];
        if (num == 0) {
            return dp;
        }
        for (int i = 1; i <= num; i++) {
            dp[i] = dp[i>>1] + i%2;
        }
        System.out.println(Arrays.toString(dp));
        return dp;
    }
}
