package sort;

import java.util.Arrays;

/**
 * created by zsj in 21:26 2018/4/21
 * description:插入排序。时间复杂度O(n2)
 **/
public class InsertSort {

    public static void main(String[] args) {
        int[] nums = new int[] {3,1,5,7,2,4,9,6,10,8,12,31,13,12,900};
        InsertSort insertSort = new InsertSort();
        insertSort.insertSort(nums);
    }

    public int[] insertSort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int length = nums.length;
        //升序
        for (int i = 1; i < length; i++) {
            int tmp = nums[i];
            int j = i-1;
            while (j >=0 && nums[j] > tmp) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = tmp;
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

}
