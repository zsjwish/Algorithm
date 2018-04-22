package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 12:56 2018/4/22
 * description:给定一个数组，里面只有一个数字只出现一次，其他的数字都出现三次，求只出现一次的数字。
 * 思路1：先对数组排序，判断前后中三个都不相等的中间那个就是要求的数字，时间复杂度O(nlogn)，因为涉及了排序
 * 思路2：一个int型数字有32位，对二进制的每一位进行加法，判断二进制每一位的和是否是3的倍数，
 * 如果不是说明那个单个数字的二进制数字在这一位为1，这时对1进行相应位数的左移操作，然后使用结果与上|左移后的结果。
 * 最终就能得到单个数字。
 **/
public class Lee137 {

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,2,3};
        Lee137 lee137 = new Lee137();
        lee137.singleNumber(nums);
    }

    public int singleNumber1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int i;
        for (i = 1; i < nums.length-1; i++) {
            if (nums[i-1]!=nums[i]&&nums[i]!=nums[i+1]) {
                break;
            }
        }
        System.out.println(nums[i]);
        return nums[i];
    }

    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int res = 0;
        int sum = 0;
        for (int i = 0; i < 32; i++) {
            sum = 0;
            for (int num : nums) {
                int tmp = (num >> i) & 1;
                sum += (num >> i) & 1;
            }
            if (sum % 3 != 0) {
                res |= 1 << i;
            }
        }
        System.out.println(res);
        return res;
    }
}
