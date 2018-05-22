package leetcode;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Arrays;

/**
 * created by zsj in 13:30 2018/5/22
 * description:
 *
 * 给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * 你找到的子数组应是最短的，请输出它的长度。
 * 思路：two points
 **/
public class Lee581 {

    public static void main(String[] args) {
        Lee581 lee581 = new Lee581();
        System.out.println(lee581.findUnsortedSubarray(new int[] {2, 6, 4, 8, 10, 9, 15}));
        System.out.println(lee581.findUnsortedSubarray(new int[] {1,2,3,4}));
    }

    public int findUnsortedSubarray1(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }
        int low = 0, high = nums.length-1;
        while (low < nums.length-1 && nums[low] < nums[low+1]) {
            low++;
        }
        while (high > low && nums[high] > nums[high-1]) {
            high--;
        }
        if (high == low) {
            return 0;
        }
        return high - low + 1;
    }

    public int findUnsortedSubarray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }
        int low = 0, high = nums.length - 1;
        int[] tmp = nums.clone();
        Arrays.sort(tmp);
        while (low <= high && nums[low] == tmp[low]) {
            low++;
        }
        while (high >= low && nums[high] == tmp[high]) {
            high--;
        }
        return high - low + 1;
    }
}
