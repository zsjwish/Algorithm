package sort;

import java.util.Arrays;

/**
 * created by zsj in 23:18 2018/4/21
 * description:简单选择排序，选出最大的数和第一个（或者最后一个）交换顺序，再选出剩下的最大的数和第二个（或者倒数第二个）交换顺序
 **/
public class SimpleSelectionSort {

    public static void main(String[] args) {
        int[] nums = new int[] {3,1,5,7,2,4,9,6,10,8,12,13,13,52,34,100,900,0};
        SimpleSelectionSort simpleSelectionSort = new SimpleSelectionSort();
        simpleSelectionSort.simSelectSort(nums);
    }

    public int[] simSelectSort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int index = i;
            for (int j = i+1; j < length; j++) {
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }
            int tmp = nums[i];
            nums[i] = nums[index];
            nums[index] = tmp;
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
