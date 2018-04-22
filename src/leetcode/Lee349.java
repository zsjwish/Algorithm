package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * created by zsj in 15:05 2018/4/20
 * description: leetcode349,找出两个数组中重复的元素，结果不能有重复的元素。思路，使用set
 **/
public class Lee349 {
    public static void main(String[] args) {
        int[] A = new int[] {1,2,2,1};
        int[] B = new int[] {2,2};
        Lee349 lee349 = new Lee349();
        lee349.intersection(A, B);
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null && nums2 == null) {
            return null;
        }
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        for (Integer i:set2) {
            if (set1.contains(i)) {
                res.add(i);
            }
        }
        int[] resNum = new int[res.size()];
        int j = 0;
        for (Integer i: res) {
            resNum[j++] = i;
        }
        System.out.println(Arrays.toString(resNum));
        return resNum;
    }
}