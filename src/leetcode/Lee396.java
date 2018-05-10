package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 16:38 2018/5/10
 * description:给定一个长度为 n 的整数数组 A 。
 * 假设 Bk 是数组 A 顺时针旋转 k 个位置后的数组，我们定义 A 的“旋转函数” F 为：
 * F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1]。
 * 计算F(0), F(1), ..., F(n-1)中的最大值。
 **/
public class Lee396 {

    public static void main(String[] args) {
        int[] nums = new int[] {4,3,2,6};
        Lee396 lee396 = new Lee396();
        lee396.rotate(nums,3);
    }

    public int[] rotate(int[] nums, int k) {
        while (k-- > 0) {
            int length = nums.length - 1;
            int tmp = nums[length];
            while (length > 0) {
                nums[length] = nums[length-1];
                length--;
            }
            nums[0] = tmp;
            System.out.println(Arrays.toString(nums));
        }
        return nums;
    }

    public int maxRotateFunction(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int k = A.length;
        int res = Integer.MIN_VALUE;
        while (k-- > 0) {
            int length = A.length - 1;
            int tmp = A[length];
            while (length > 0) {
                A[length] = A[length-1];
                length--;
            }
            A[0] = tmp;
            int sum = 0;
            for (int i = 0; i < A.length; i++) {
                sum += A[i]*i;
            }
            System.out.println(sum);
            if (sum > res) {
                res = sum;
            }
        }
        return res;
    }

}
