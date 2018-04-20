package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 19:47 2018/4/20
 * description: 获取数组中连续和最大的子序列和他们的最大和。使用dp。
 * 代码中还在判断Math.max的时候讲子序列数组的start和end记录下来，并且截取子数组。
 **/
public class lee53 {
    public static void main(String[] args) {
        int[] A = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        lee53 lee53 = new lee53();
        lee53.maxSubArray(A);
    }

    public int maxSubArray(int[] nums) {
        if (nums == null || nums. length == 0) {
            return 0;
        }
        int tmp = nums[0];
        int max = tmp;
        int start = 0, end = 0;
        for (int i = 1; i < nums.length; i++) {
            if (tmp + nums[i] <= nums[i]) {
                start = i;
            }
            tmp = Math.max(nums[i], tmp + nums[i]);
            if (max < tmp) {
                end = i;
            }
            max = Math.max(max, tmp);
        }
        System.out.println(start);
        System.out.println(end);
        int[] aim = new int[end - start + 1];
        System.arraycopy(nums, start, aim, 0, end - start + 1);
        System.out.println(Arrays.toString(aim));
        return max;
    }
}
