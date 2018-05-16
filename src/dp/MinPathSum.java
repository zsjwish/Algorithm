package dp;

import java.util.Arrays;

/**
 * created by zsj in 19:54 2018/5/16
 * description：给定一个二维数组，从左上角走到右下角，只能向下或者向右移动，
 * 求最小路径，即路上走过的数字总和
 * 思路：dp
 * */
public class MinPathSum {

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,3,5,9},{8,1,3,4},{5,0,6,1},{8,8,4,0}};
        MinPathSum minPathSum = new MinPathSum();
        minPathSum.getMinPathSum(nums);
    }

    public int getMinPathSum(int[][] nums) {
        int[][] dp = nums.clone();
        int row = nums.length;
        int col = nums[0].length;
        for (int i = 1; i < row; i++) {
            dp[i][0] += dp[i-1][0];
        }
        for (int i = 1; i < col; i++) {
            dp[0][i] += dp[0][i-1];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                dp[i][j] += Math.min(dp[i-1][j], dp[i][j-1]);
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[row-1][col-1];
    }
}
