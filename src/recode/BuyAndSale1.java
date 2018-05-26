package recode;

import java.util.Arrays;

/**
 * created by zsj in 19:09 2018/5/26
 * description:
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * 注意你不能在买入股票前卖出股票。
 **/
public class BuyAndSale1 {
    public static void main(String[] args) {
        BuyAndSale1 buyAndSale1 = new BuyAndSale1();
        buyAndSale1.maxProfit(new int[]{1,5,3,6,4});
        buyAndSale1.maxProfit1(new int[]{7,4,3,1});
    }
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int[] dp = new int[prices.length];
        dp[0] = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                dp[i] = Math.max(dp[i-1], prices[i] - min);
            }
            else {
                dp[i] = dp[i-1];
            }
            min = Math.min(min, prices[i]);
        }
        System.out.println(Arrays.toString(dp));
        return dp[prices.length-1];
    }
    public int maxProfit1(int[] prices) {
        int length = prices.length;
        if (prices == null || length == 0){
            return 0;
        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (prices[i]<min){
                min = prices[i];
            }
            else {
                max = Math.max(max, prices[i] - min);
            }
        }
        System.out.println(max);
        return max;
    }
}
