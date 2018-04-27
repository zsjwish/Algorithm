package leetcode;

/**
 * created by zsj in 21:45 2018/4/27
 * description:给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数
 **/
public class Lee643 {

    public static void main(String[] args) {
        int[] nums = new int[] {3};
        Lee643 lee643 = new Lee643();
        lee643.findMaxAverage(nums, 1);
    }

    public double findMaxAverage(int[] nums, int k) {
        if (nums == null || nums.length < k) {
            return 0;
        }
        long max = 0;
        long tmp = 0;
        for (int i = 0; i < k; i++) {
            tmp += nums[i];
            max = tmp;
        }
        for (int i = k; i < nums.length; i++) {
            tmp = tmp - nums[i-k] + nums[i];
            max = Math.max(max, tmp);
        }
        double average = (double) max / k;
        System.out.println(average);
        return average;
    }

}
