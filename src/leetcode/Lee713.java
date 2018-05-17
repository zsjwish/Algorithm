package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * created by zsj in 16:53 2018/5/17
 * description:你有一系列正整数nums。
 * 计算并打印子阵列中所有元素的乘积小于（连续）的子阵列的数量k。
 **/
public class Lee713 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        Lee713 lee713 = new Lee713();
        lee713.numSubarrayProductLessThanK(nums, 0);
    }

    private int numSubarrayProductLessThanK(int[] nums, int k) {
        int low = 0, high = 0;
        int count = 0;
        int res = 1;
        for (high = 0; high < nums.length; high++) {
            res *= nums[high];
            while (low <= high && res >= k) {
                res /= nums[low];
                low++;
            }
            count += high - low + 1;
        }
        System.out.println(count);
        return count;
    }

    public int numSubarrayProductLessThanK1(int[] nums, int k) {
        List<Integer> list = new LinkedList<>();
        List<List<Integer>> resList = new LinkedList<>();
        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            if (res * nums[i] < k) {
                list.add(nums[i]);
                resList.add(new LinkedList<>(list));
                res *= nums[i];
            }
            else {
//                if (!list.isEmpty()) {
                    res /= list.get(0);
                    resList.add(new LinkedList<>(list.subList(1,2)));
                    list.remove(0);
                    i--;
//                }
            }
        }
        System.out.println(resList);
        return resList.size();
    }

}
