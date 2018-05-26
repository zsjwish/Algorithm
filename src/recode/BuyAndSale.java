package recode;

/**
 * created by zsj in 16:49 2018/5/26
 * description:给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 **/
public class BuyAndSale {
    public static void main(String[] args) {
        BuyAndSale buyAndSale = new BuyAndSale();
        buyAndSale.maxProfit(new int[]{7,6,4,3,1});
    }
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int length = prices.length - 1;
        int cur = prices[length];
        int res = 0;
        for (int i = length-1; i >=0; i--) {
            if (prices[i] < cur) {
                res += cur - prices[i];
            }
            cur = prices[i];
        }
        System.out.println(res);
        return res;
    }
}
