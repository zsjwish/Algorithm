package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 16:10 2018/5/22
 * description:在一个给定的数组nums中，总是存在一个最大元素 。
 * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
 * 如果是，则返回最大元素的索引，否则返回-1。
 **/
public class Lee747 {

    public static void main(String[] args) {

    }
    public int dominantIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }
        int maxIndex = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > nums[maxIndex])
                maxIndex = i;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (maxIndex != i && nums[maxIndex] < 2 * nums[i])
                return -1;
        }
        return maxIndex;
    }
    public int dominantIndex1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }
        int[] tmp = nums.clone();
        Arrays.sort(tmp);
        if (tmp[nums.length-2] * 2 > tmp[nums.length-1]) {
            return -1;
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == tmp[nums.length-1]) {
                    return i;
                }
            }
        }
        return -1;
    }
}
