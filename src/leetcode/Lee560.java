package leetcode;

/**
 * created by zsj in 11:22 2018/9/21
 * description:给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。
 **/
public class Lee560 {
    public static void main(String[] args) {
//        System.out.println(subarraySum(new int[]{1,1,1,2}, 2));
        System.out.println(subarraySum(new int[]{1,2,3}, 3));
    }

    public static int subarraySum(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int sum = 0;
        int res = 0;
        while (high < nums.length && low <= high) {
            if (sum > k) {
                sum -= nums[low++];
            }
            else if (sum < k) {
                sum += nums[high++];
            }
            else {
                res++;
                sum -= nums[low++];
            }
        }
        return res;
    }

}
