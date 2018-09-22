package leetcode;

import java.util.Stack;

/**
 * created by zsj in 10:18 2018/9/21
 * description:给定一个整数序列：a1, a2, ..., an，
 * 一个132模式的子序列 ai, aj, ak 被定义为：当 i < j < k 时，ai < ak < aj。设计一个算法，
 * 当给定有 n 个数字的序列时，验证这个序列中是否含有132模式的子序列。
 **/
public class Lee456 {
    public static void main(String[] args) {
        System.out.println(find132pattern(new int[]{-1,3,2,0}));
        System.out.println(find132pattern(new int[]{1,2,3,4}));
    }

    public static boolean find132pattern(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int thirdNum = Integer.MIN_VALUE;
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] < thirdNum) {
                return true;
            }
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                thirdNum = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }

    public static boolean find132pattern1(int[] nums) {
        if (nums == null || nums.length <= 2) {
            return false;
        }
        int length = nums.length;
        for (int i = 0; i < length - 2; i++) {
            for (int j = i+1; j < length - 1; j++) {
                if (nums[j] <= nums[i]) {
                    continue;
                }
                for (int k = j+1; k < length; k++) {
                    if (nums[k] < nums[j] && nums[k] > nums[i]) {
                        return true;
                    }

                }
            }
        }
        return false;
    }
}
