package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 10:18 2018/5/8
 * description:我们正在玩一个猜数游戏，游戏规则如下：
 * 我从 1 到 n 之间选择一个数字，你来猜我选了哪个数字。
 * 每次你猜错了，我都会告诉你，我选的数字比你的大了或者小了。
 * 然而，当你猜了数字 x 并且猜错了的时候，你需要支付金额为 x 的现金。直到你猜到我选的数字，你才算赢得了这个游戏。
 **/
public class Lee375 {

    public static void main(String[] args) {
        Lee375 lee375 = new Lee375();
        lee375.getMoneyAmount(10);
    }

    public int getMoneyAmount(int n) {
        int[][] dp = new int[n+1][n+1];
        System.out.println(getMin(dp, 1, n));
        return getMin(dp, 1, n);
    }

    public int getMin(int[][] dp, int start, int end) {
        if (start >= end) {
            return 0;
        }
        if (dp[start][end] != 0) {
            return dp[start][end];
        }
        int res = Integer.MAX_VALUE;
        for (int i = start; i <= end; i++) {
            int tmp = i + Math.max(getMin(dp, start, i-1), getMin(dp, i+1, end));
            if (tmp < res) {
                res = tmp;
            }
        }
        dp[start][end] = res;
        return res;
    }



}
