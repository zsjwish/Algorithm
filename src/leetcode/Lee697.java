package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * created by zsj in 15:03 2018/4/30
 * description:给定一个非空且只包含非负数的整数数组 nums, 数组的度的定义是指数组里任一元素出现频数的最大值。
 * 你的任务是找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
 * 即找出数组中出现次数最大的数的跨度，就是最先出现和最后出现的距离
 **/
public class Lee697 {

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,2,3,1};
        Lee697 lee697 = new Lee697();
        lee697.findShortestSubArray(nums);
    }

    public int findShortestSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        int max = 0;
        for (int num : map.values()) {
            if (num >= max) {
                max = num;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int num : map.keySet()) {
            int tmp = map.get(num);
            if (max == tmp) {
                int low = 0, high = nums.length-1;
                while (nums[low] != num) {
                    low++;
                }
                while (nums[high] != num) {
                    high--;
                }
                min = Math.min(min, high - low + 1);
            }
        }
        System.out.println(min);
        return min;
    }

}
