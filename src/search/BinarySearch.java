package search;

import java.util.Arrays;

/**
 * created by zsj in 17:17 2018/4/25
 * description:二分查找
 **/
public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = new int[] {3,1,5,7,2,4,9,6,10,8,31,13,12,900};
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.binarySearch(nums, 15);
    }

    public int binarySearch(int[] nums, int target) {
        if (nums == null || nums.length ==0) {
            System.out.println(-1);
            return -1;
        }
        Arrays.sort(nums);
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                System.out.println(mid);
                return mid;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        System.out.println(-1);
        return -1;

    }
}
