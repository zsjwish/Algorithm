package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 15:04 2018/4/28
 * description:给出一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * 限制：O(N)时间复杂度，O(1)空间复杂度
 **/
public class Lee268 {

    public static void main(String[] args) {
        int[] nums = new int[]{3,1,0,4,5,7,6};
        Lee268 lee268 = new Lee268();
        lee268.missingNumber(nums);
    }

    public int numsSort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            while (i != nums[i]) {
                int tmp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = tmp;
            }
        }
        System.out.println(Arrays.toString(nums));
        return 0;
    }
    //加上数组里面的值，减去i的值，初始为nums.length。因为数组中最大的数就是nums.length
    public int missingNumber1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res += i - nums[i];
        }
        System.out.println(res);
        return res;
    }

    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int res = 0;
        res ^= nums.length;
        for (int i = 0; i < nums.length; i++) {
            res ^= i;
            res ^= nums[i];
        }
        System.out.println(res);
        return res;
    }

}
