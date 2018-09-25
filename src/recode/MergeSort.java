package recode;

import java.util.Arrays;

/**
 * created by zsj in 23:21 2018/9/25
 * description:
 **/
public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {26, 5, 98, 108, 28, 99, 100, 56, 34, 1,34};
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void mergeSort(int[] nums) {
        sort(nums, 0, nums.length-1);
    }

    public static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        sort(nums, low, mid);
        sort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        int[] tmp = new int[nums.length];
        int i = low, j = mid+1;
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
    }
}