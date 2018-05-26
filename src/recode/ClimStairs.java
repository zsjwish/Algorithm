package recode;

import java.util.Arrays;

/**
 * created by zsj in 19:41 2018/5/26
 * description:假设你正在爬楼梯。需要 n 步你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 **/
public class ClimStairs {
    public static void main(String[] args) {

    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}
