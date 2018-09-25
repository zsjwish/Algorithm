package recode;

/**
 * created by zsj in 17:46 2018/9/25
 * description:快排
 **/
public class QuickSort {
    public static void main(String[] args) {

    }

    public static int[] quickSortMain(int[] nums) {


        return nums;

    }

    public static int[] quickSortHelp(int[] nums, int start, int end) {
        if (nums == null || nums.length == 0 || start >= end) {
            return nums;
        }
        int base = nums[start];
        int low = start, high = end;
        while (low < high) {
            while (high > low && nums[low] <= base) {
                low++;
            }
            while (high > low && nums[high] >= base) {
                high--;
            }
            if (low < high) {
                int tmp = nums[low];
                nums[low] = nums[high];
                nums[high] = tmp;
            }
        }
        nums[start] = nums[low];
        nums[low] = base;
        quickSortHelp(nums, start, low-1);
        quickSortHelp(nums, low+1, end);
        return nums;
    }
}
