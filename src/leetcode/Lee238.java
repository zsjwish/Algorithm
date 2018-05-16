package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 15:15 2018/5/16
 * description:给定长度为 n 的整数数组 nums，其中 n > 1，
 * 返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 * 输入: [1,2,3,4]
 * 输出: [24,12,8,6]
 * 限制：不能使用除法，时间复杂度O(N)
 **/
public class Lee238 {
    public static void main(String[] args) {
        Lee238 lee238 = new Lee238();
        int[] nums = new int[]{1,2,3,4,5};
        lee238.productExceptSelf(nums);
        lee238.productExceptSelf1(nums);
        lee238.productExceptSelf2(nums);
        lee238.productExceptSelf3(nums);
    }
    //使用除法，时间复杂度O(N)
    public int[] productExceptSelf(int[] nums) {
        int mul = 1;
        int[] res = new int[nums.length];
        for (int tmp : nums) {
            mul *= tmp;
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = mul / nums[i];
        }
        System.out.println(Arrays.toString(res));
        return res;

    }
    //不使用除法，时间复杂度O(N2)
    public int[] productExceptSelf1(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int tmp = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    tmp *= nums[j];
                }
            }
            res[i] = tmp;
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
    //不使用除法，时间复杂度为O(N)
    public int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }

    public int[] productExceptSelf3(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i-1] * nums[i-1];
        }
        int right = 1;
        for (int i = nums.length - 1; i >=0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
