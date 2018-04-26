package leetcode;

import java.util.*;

/**
 * created by zsj in 11:19 2018/4/26
 * description:给定一个整数数组和一个整数 k, 你需要在数组里找到不同的 k-diff 数对。
 * 这里将 k-diff 数对定义为一个整数对 (i, j), 其中 i 和 j 都是数组中的数字，且两数之差的绝对值是 k.
 * 思路：将每个数加入map的key中，map的value是i,如果有重复的话会覆盖，然后将i的值覆盖
 **/
public class Lee532 {

    public static void main(String[] args) {
        int[] nums = new int[] {3,1,4,1,5,7};
        Lee532 lee532 = new Lee532();
        lee532.findPairs(nums, 2);
    }

    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length <= 1 || k < 0) {
            return 0;
        }
//        Arrays.sort(nums);
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        LinkedList<List> res = new LinkedList<>();
        int resNum = 0;
        for (int i = 0; i < nums.length; i++) {
            //nums[i]+k!=i 说明这个key有覆盖。就是有重复的数字。
            if (map.containsKey(nums[i] + k) && map.get(nums[i] + k) != i) {
                LinkedList<Integer>tmp = new LinkedList<>();
                tmp.add(nums[i]);
                tmp.add(nums[i] + k);
                res.add(tmp);
                resNum ++;
                //每次计算完后将这个value删除，避免重复计算，注意这个计算是前面的值匹配后面的值。前 + k = 后
                //这样做不会出错是因为我们每次取key的时候是从数组中取的。
                map.remove(nums[i]+k);
            }
        }
        System.out.println(res);
        System.out.println(resNum);
        return resNum;
    }

}
