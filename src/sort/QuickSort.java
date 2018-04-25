package sort;

import java.util.Arrays;

/**
 * created by zsj in 16:50 2018/4/25
 * description:
 **/
public class QuickSort {

    public static void main(String[] args) {
        int[] nums = new int[] {3,1,5,7,2,4,9,6,10,8,12,31,13,12,900,1,12,2,3,1,1};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSortMain(nums);
    }

    public int[] quickSortMain(int[] nums) {
        nums = quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public int[] quickSort(int[] nums, int low, int high) {
        if (nums == null || nums.length <= 1 || low > high) {
            return nums;
        }
        int key = nums[low];
        int i = low, j = high;
        while (i < j) {

            while (j > i && nums[j] >= key) {
                j--;
            }
            while (j > i && nums[i] <= key) {
                i++;
            }

            if (i < j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        nums[low] = nums[i];
        nums[i] = key;
        quickSort(nums, low, i-1);
        quickSort(nums, i+1, high);
//        System.out.println(Arrays.toString(nums));
        return nums;
    }

}

