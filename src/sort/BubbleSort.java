package sort;

import java.util.Arrays;

/**
 * created by zsj in 11:00 2018/4/22
 * description:冒泡排序 时间复杂度O(n2)
 **/
public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = new int[] {3,1,5,7,2,4,9,6,10,8,12,31,13,12,900};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(nums);
    }

    public int[] bubbleSort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (nums[j] > nums[j+1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
