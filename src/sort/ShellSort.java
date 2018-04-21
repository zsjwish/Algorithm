package sort;

import java.util.Arrays;

/**
 * created by zsj in 21:40 2018/4/21
 * description:shell排序，其实就是跳级的插入排序，比如最开始跳跃的距离是nums.length/2,以后每次减半。
 **/
public class ShellSort {

    public static void main(String[] args) {
        int[] nums = new int[] {3,1,5,7,2,4,9,6,10,8,12,13,13,52,34,100,900};
        ShellSort shellSort = new ShellSort();
        shellSort.shellSort(nums);
    }

    public int[] shellSort(int[] nums) {
        int step = nums.length/2;
        while (step >= 1) {
            nums = shellSortInsert(nums, step);
            step /= 2;
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public int[] shellSortInsert(int[] nums, int step) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int length = nums.length;
        for (int i = step; i < length; i++) {
            while (i >= step && nums[i] < nums[i-step]) {
                int tmp = nums[i];
                nums[i] = nums[i-step];
                nums[i-step] = tmp;
                i=i-step;
            }
        }
        return nums;
    }
}
