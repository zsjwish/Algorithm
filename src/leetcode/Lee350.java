package leetcode;

import java.util.Arrays;
import java.util.Vector;

/**
 * created by zsj in 20:37 2018/4/22
 * description:给定两个数组，写一个方法来计算它们的交集。给定 nums1 = [1, 2, 2, 1], nums2 = [2, 2], 返回 [2, 2].
 **/
public class Lee350 {

    public static void main(String[] args) {
        int[] num1 = new int[]{1,2,2,1,3};
        int[] num2 = new int[]{2,2,1,3};
        Lee350 lee350 = new Lee350();
        lee350.intersect(num1, num2);
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return null;
        }
        if (nums1.length == 0 && nums2.length == 0) {
            return nums1;
        }
        Vector<Integer> res = new Vector<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int hight1 = nums1.length - 1;
        int hight2 = nums2.length - 1;
        int low1 = 0, low2 = 0;
        while (low1 <= hight1 && low2 <= hight2) {
            if (nums1[low1] == nums2[low2]) {
                res.add(nums1[low1]);
                low1++;
                low2++;
            }
            else if (nums1[low1] < nums2[low2]) {
                low1++;
            }
            else {
                low2++;
            }
        }
        int[] resInt = new int[res.size()];
        int i = 0;
        for (Integer num : res) {
            resInt[i++] = num;
        }
        System.out.println(Arrays.toString(resInt));
        return resInt;
    }

}
