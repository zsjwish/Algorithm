package sort;

import java.util.Arrays;

/**
 * created by zsj in 15:05 2018/4/27
 * description:归并排序,先分再合。
 **/
public class MergeSort {

    public static void main(String[] args) {
        int[] nums = new int[] {3,1,5,7,2,4,9,6};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(nums);
    }


    public int[] mergeSort(int[] nums) {
        int[] tmp = new int[nums.length];
        int[] res = sort(nums, 0, nums.length - 1, tmp);
        System.out.println(Arrays.toString(res));
        return res;
    }

    public int[] sort(int[] nums, int low, int high, int[] tmp) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }

        if (low < high) {
            int mid = (low + high) / 2;
            sort(nums, low, mid,tmp);
            sort(nums, mid + 1, high, tmp);
            merge(nums, low, mid, high, tmp);
        }
//        System.out.println(Arrays.toString(nums));
        return nums;
    }

    private void merge(int[] nums, int low, int mid, int high, int[] tmp) {
        int i = low;
        int j = mid + 1;
        int t = 0;
        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) {
                tmp[t++] = nums[i++];
            }
            else {
                tmp[t++] = nums[j++];
            }
        }
        while (i <= mid) {
            tmp[t++] = nums[i++];
        }
        while (j <= high) {
            tmp[t++] = nums[j++];
        }
        t = 0;
        while (low <= high) {
            nums[low++] = tmp[t++];
        }
//        System.out.println(Arrays.toString(nums));
    }

}
