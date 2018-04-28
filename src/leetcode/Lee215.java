package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 10:29 2018/4/28
 * description:找出第k大的数，不排除重复的数
 **/
public class Lee215 {

    public static void main(String[] args) {
        int[] nums = new int[] {2,1};
        Lee215 lee215 = new Lee215();
        lee215.findKthLargest(nums, 1);
    }

    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        Arrays.sort(nums);
        System.out.println(nums[nums.length - k]);
        return nums[nums.length - k];
    }
}
