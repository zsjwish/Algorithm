package dp;

/**
 * created by zsj in 17:01 2018/9/25
 * description:给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * 注意你不能在买入股票前卖出股票。
 **/
public class Lee121 {
    public static void main(String[] args) {

    }

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > min) {
                max = Math.max(max, prices[i] - min);
            }
            min = Math.min(min, prices[i]);
        }
        return max;


//        if (prices == null || prices.length <= 1) {
//            return 0;
//        }
//        int[] dp = new int[prices.length];
//        dp[0] = 0;
//        int min = prices[0];
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[i] > prices[i-1]) {
//                dp[i] = Math.max(dp[i-1], prices[i] - min);
//            }
//            else {
//                dp[i] = dp[i-1];
//            }
//            min = Math.min(min, prices[i]);
//        }
//        return dp[prices.length-1];
    }

}
