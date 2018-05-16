package dp;

/**
 * created by zsj in 20:09 2018/5/16
 * description:给定数组arr,arr中所有的值都为整数且不能重复，每个值代表一种面值的货币，每种面值的货币都可以使用任意张，
 * 给定一个整数aim代表要找的钱，求组成aim的最少货币数
 * --------------------------------------------------------未完成
 **/
public class MinMoneyTimes {

    public static void main(String[] args) {
        int[] nums = new int[] {2,3,5};
        MinMoneyTimes minMoneyTimes = new MinMoneyTimes();
        System.out.println(minMoneyTimes.getMinMoneyTimes(nums, 22));
    }

    public int getMinMoneyTimes(int[] nums, int aim) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            if (aim == nums[i]) {
                return 1;
            }
        }
        if (aim < min) {
            return 999999;
        }
        else {
            int minReturn = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                minReturn = Math.min(minReturn, 1 + getMinMoneyTimes(nums, aim - nums[i]));
            }
            return minReturn;
        }
    }
}
