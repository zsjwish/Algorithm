package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 20:55 2018/4/22
 * description:给定一个数组 nums, 编写一个函数将所有 0 移动到它的末尾，同时保持非零元素的相对顺序。
 * 例如， 定义 nums = [0, 1, 0, 3, 12]，调用函数之后， nums 应为 [1, 3, 12, 0, 0]。
 * 自己的思路：碰到一个0就把它移动到最末尾，中间经历的数顺次往前移动一位，复杂度为O(n2)
 * 网上的思路:遍历数组，遇到不为0的从前往后存放，存放一个后下标+1，同时记录0的个数，最后将数组最后面的全部补0！！
 **/
public class Lee283 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,0,3,12,0,4,45,4,5,6,7,0,9,0,81,0};
        int[] nums1 = new int[]{0,1,0};
        Lee283 lee283 = new Lee283();
        lee283.moveZeroes(nums);
        lee283.moveZeroes(nums1);
    }

    private void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int length = nums.length;
        int notZero = 0, isZero = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                nums[notZero++] = nums[i];
            }
            else {
                isZero++;
            }
        }
        while (isZero-->0) {
            nums[length - isZero - 1] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes1(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int hight = nums.length-1;
        int low = 0;
        for (int i = 0; i <= hight; i++) {
            if (nums[low] == 0) {
                for (int j = low+1; j <= hight; j++) {
                    nums[j-1] = nums[j];
                }
                nums[hight] = 0;
            }
            else {
                low++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
