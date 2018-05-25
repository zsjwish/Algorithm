package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 14:39 2018/5/25
 * description:给定两个没有重复元素的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。
 * 找到 nums1 中每个元素在 nums2 中的下一个比其大的值。
 * nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出-1。
 **/
public class Lee496 {
    public static void main(String[] args) {
        Lee496 lee496 = new Lee496();
        lee496.nextGreaterElement(new int[]{4,1,2},new int[]{1,2,3,4});
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] tmp = new int[nums2.length];
        for (int i = 0; i < nums2.length; i++) {
            int cur = nums2[i];
            for (int j = i; j < nums2.length; j++) {
                if (nums2[j] > cur) {
                    tmp[i] = nums2[j];
                    break;
                }
            }
        }
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] == 0) {
                tmp[i] = -1;
            }
        }
        System.out.println(Arrays.toString(tmp));
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    res[i] = tmp[j];
                }
            }
        }
        return res;
    }
}
