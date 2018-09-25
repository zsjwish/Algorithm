package dp;

/**
 * created by zsj in 17:32 2018/9/25
 * description:给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）
 **/
public class Lee122 {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int sum = 0;
        int length = prices.length;
        int cur = prices[length-1];
        for (int i = length - 1; i >= 0; i--) {
            if (prices[i] < cur) {
                sum += cur - prices[i];
            }
            cur = prices[i];
        }
        return sum;
    }
}
