package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 16:05 2018/4/22
 * description: 一个数组，只有两个数只出现过一次，其余的都出现两次，求这两个只出现一次的数，
 **/
public class Lee260 {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 1, 3, 2, 5,5,7};
        Lee260 lee260 = new Lee260();
        lee260.singleNumber(nums);
    }

    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int resInt = 0;
        for (int num : nums) {
            resInt ^= num;
        }
        resInt &= -resInt;
        for (int num : nums) {
            if ((resInt & num) == 0) {
                res[0] ^= num;
            }
            else {
                res[1] ^= num;
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
