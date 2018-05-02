package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * created by zsj in 14:22 2018/5/2
 * description:给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 思路：对于每个数，向后移k,则是当前下标+k%length.使用一个新的数组，一步解决，时间复杂度O(N),空间复杂度O(N).
 * 但是要求空间复杂度为O(1),所以应该每次移一步。因为在原数组中移k步可能会造成循环。
 **/
public class Lee189 {

    public static void main(String[] args) {
        int[] nums = new int[] {2,4,1,6,-5,9};
        Lee189 lee189 = new Lee189();
        lee189.rotate(nums, 3);
        lee189.rotate1(nums, 3);

    }

    private void rotate(int[] nums, int i) {
        int[] res = nums.clone();
        for (int j = 0; j < nums.length; j++) {
            nums[(j+i)%nums.length] = res[j];
        }
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(nums));

    }

    public void rotate1(int[] nums, int k) {
        if (k <= 0 || nums == null || nums.length <= 1) {
            return;
        }
        while (--k >= 0) {
            int tmp = 0;
            tmp = nums[nums.length-1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i-1];
            }
            nums[0] = tmp;
            System.out.println(Arrays.toString(nums));
        }
    }

}
