package recode;

import java.util.Arrays;

/**
 * created by zsj in 16:02 2018/4/27
 * description:重写快排
 **/
public class RQuickSort {

    public static void main(String[] args) {
        int[] nums = new int[] {3,1,5,7,2,4,9,6};
        RQuickSort rQuickSort = new RQuickSort();
        rQuickSort.quickSort(nums);
    }

    public int[] quickSort(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        int[] res = sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(res));
        return res;
    }

    public int[] sort(int[] nums, int low, int high) {
        if (nums == null || nums.length <= 1 || low > high) {
            return nums;
        }
        int aim = nums[low];
        int i = low, j = high;
        while (i < j) {
            while (i < j && nums[j] <= aim) {
                j--;
            }
            while (i < j && nums[i] >= aim) {
                i++;
            }
            if (i < j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        nums[low] = nums[i];
        nums[i] = aim;
        sort(nums, low, i-1);
        sort(nums, i+1, high);
        return nums;
    }

}
