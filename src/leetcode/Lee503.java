package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 16:31 2018/5/25
 * description:给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），输出每个元素的下一个更大元素。
 * 数字 x 的下一个更大的元素是按数组遍历顺序，这个数字之后的第一个比它更大的数，这意味着你应该循环地搜索它的下一个更大的数。
 * 如果不存在，则输出 -1。
 **/
public class Lee503 {

    public static void main(String[] args) {
        Lee503 lee503 = new Lee503();
        lee503.nextGreaterElements(new int[]{-1,0});

    }

    public int[] nextGreaterElements(int[] nums) {
        int[] sb = new int[nums.length*2];
        System.arraycopy(nums,0,sb,0,nums.length);
        System.arraycopy(nums,0,sb,nums.length,nums.length);
        int[] res = new int[nums.length];
        Arrays.fill(res, Integer.MIN_VALUE);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < sb.length; j++) {
                int tmp = sb[j];
                if (tmp > nums[i]) {
                    res[i] = tmp;
                    break;
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] == Integer.MIN_VALUE) {
                res[i] = -1;
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

}
