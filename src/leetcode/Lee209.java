package leetcode;

/**
 * created by zsj in 16:39 2018/9/9
 * description:给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组。
 * 如果不存在符合条件的连续子数组，返回 0。
 **/
public class Lee209 {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }

    public static int minSubArrayLen(int s, int[] nums) {
        int length = nums.length;
        int minN = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            int tmp = 0;
            for (int j = i; j < length; j++) {
                tmp += nums[j];
                if (tmp >= s) {
                    minN = Math.min(minN, j-i+1);
                }
            }
        }
        if (minN == Integer.MAX_VALUE) {
            return 0;
        }
        return minN;
    }
}
