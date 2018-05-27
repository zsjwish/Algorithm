package leetcode;

/**
 * created by zsj in 13:17 2018/5/27
 * description:给定一个未经排序的整数数组，找到最长且连续的的递增序列。
 **/
public class Lee674 {
    public static void main(String[] args) {
        Lee674 lee674 = new Lee674();
        System.out.println(lee674.findLengthOfLCIS(new int[]{1,1,1,1,2}));
    }
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int start = 0, end = nums.length-1;
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i-1]) {
                max = Math.max(max, i-start);
                start = i;
            }
        }
        max = Math.max(max, nums.length - start);
        if (start == 0) {
            return nums.length;
        }
        return max;
    }
}
