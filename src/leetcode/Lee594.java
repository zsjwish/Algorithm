package leetcode;

import java.util.*;

/**
 * created by zsj in 16:50 2018/5/11
 * description:和谐数组是指一个数组里元素的最大值和最小值之间的差别正好是1。
 * 现在，给定一个整数数组，你需要在所有可能的子序列中找到最长的和谐子序列的长度。
 **/
public class Lee594 {

    public static void main(String[] args) {
        int[] nums = new int[] {1,3,2,2,5,2,3,7};
        Lee594 lee594 = new Lee594();
        lee594.findLHS(nums);
    }

    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i,map.containsKey(i) ? map.get(i) + 1 : 1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);
        System.out.println(map);
        int max = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i+1) - list.get(i) <= 1) {
                int res = map.get(list.get(i+1)) + map.get(list.get(i));
                max = Math.max(max, res);
            }
        }
        System.out.println(max);
        return max;
    }
}
