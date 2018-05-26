package recode;

import java.util.Arrays;

/**
 * created by zsj in 16:30 2018/5/26
 * description:给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 **/
public class DeleteDumNum {
    public static void main(String[] args) {
        DeleteDumNum deleteDumNum = new DeleteDumNum();
        deleteDumNum.removeDuplicates(new int[]{1,1,1,2});
    }
    public int removeDuplicates(int[] nums) {
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[res] = nums[i];
                res++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return res;
    }
}
