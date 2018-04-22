package sort;

import java.util.Arrays;

/**
 * created by zsj in 23:32 2018/4/21
 * description:功能和简单选择排序类似，只是每次即选出最小值也选出最大值。这样外面循环只需要n/2次
 **/
public class SelectSort {
    public static void main(String[] args) {
        int[] nums = new int[] {3,1,5,7,2,4,9,6,10,8,3,1,5,7,2,4,9,6,10,8,12,31,13,12,900};
        SelectSort selectSort = new SelectSort();
        selectSort.selectSort(nums);
    }

    public int[] selectSort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int length = nums.length;
        for (int i = 0; i < (length+1)/2; i++) {
            int min = i, max = i;
            for (int j = i+1; j < length-i; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
                if (nums[j] > nums[max]) {
                    max = j;
                }
            }
            if (i!=min) {
                int tmp1 = nums[i];
                nums[i] = nums[min];
                nums[min] = tmp1;
            }
            //这一步非常重要！！！git
            //如果max指向i的位置，在以一次min和i交换后，max应该指向交换后的位置，也就是min的位置，而不是之前i的位置。
            if (max == i) {
                max = min;
            }
            if (length-1-i!=min) {
                int tmp2 = nums[length - i - 1];
                nums[length - i - 1] = nums[max];
                nums[max] = tmp2;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
