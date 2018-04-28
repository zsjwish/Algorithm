package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 14:40 2018/4/28
 * description:思路1：先对数组排序，然后取最后三个的乘积和第一个，第二个最后一个的乘积中的最大值。因为三个数中有两个负数。
 * 这样时间复杂度是O(NlogN)
 * 思路2：每次判断是否是最大的三个数和最小的两个负数.时间复杂度为O(N)
 **/
public class Lee628 {

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3};
        Lee628 lee628 = new Lee628();
        lee628.maximumProduct(nums);
    }

    public int maximumProduct1(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0]*nums[1], nums[nums.length-2]*nums[nums.length-3])*nums[nums.length-1];
    }

    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }
            else if (nums[i] > max2) {
                max3 = max2;
                max2 = nums[i];
            }
            else if (nums[i] > max3) {
                max3 = nums[i];
            }
            if (nums[i] < min1) {
                min2 = min1;
                min1 = nums[i];
            }
            else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }
        System.out.println(Math.max(max1*max2*max3, max1*min1*min2));
        return Math.max(max1*max2*max3, max1*min1*min2);
    }

}
