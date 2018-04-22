package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 20:44 2018/4/20
 * description:求一个数是完全数之和的最小完全数，完全数就是n*n这种。
 * 输入：n,输出：n由几个完全数组成
 * 思路：首先初始化一个大小为n+1的数组，这是为了取n时下标也为n,不会造成溢出。并将每一个初始化为Integer.MAX_VALUE
 * i+j*j<=n，从前往后更新。dp[i+j*j] = Math.min(dp[i]+1,dp[i+j*j]);
 * 最后返回dp[n];
 **/
public class Lee279 {
    public static void main(String[] args) {
        Lee279 lee279 = new Lee279();
        lee279.numSquares(15);
    }
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for (int i = 1; i * i <= n; i++) {
            dp[i*i] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; i + j*j <= n; j++) {
                dp[i + j*j] = Math.min(dp[i] + 1, dp[i+ j*j]);
            }
        }
        System.out.println(dp[n]);
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}
