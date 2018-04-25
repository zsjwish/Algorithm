package sort;

import java.util.Arrays;

/**
 * created by zsj in 16:50 2018/4/25
 * description:快速排序。步骤：
 * 1.确定第一个为基准
 * 2.从后往前找到第一个比基准小的数 j
 * 3.从前往后找到第一个比基准大的数 i
 * 4.在数组中交换这两个数。并且重复步骤2，3直到两个指针相遇。
 * 5.相遇后交换相遇的点的数和基准数。
 * 6.将数组按相遇的点一分为2，重复上述步骤，直到每一块都是一个数为止。
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

