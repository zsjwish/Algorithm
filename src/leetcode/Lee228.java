package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * created by zsj in 14:16 2018/5/14
 * description:给定一个无重复元素的有序整数数组，返回数组区间范围的汇总。
 * 输入: [0,1,2,4,5,7]
 * 输出: ["0->2","4->5","7"]
 * 解释: 0,1,2 可组成一个连续的区间; 4,5 可组成一个连续的区间。
 **/
public class Lee228 {

    public static void main(String[] args) {
        Lee228 lee228 = new Lee228();
        lee228.summaryRanges(new int[] {0,1,2,4,5});
    }
    //数组原本就是有序的，所以不需要再排序
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new LinkedList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        int start = nums[0];
        int end = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1] != nums[i]+1) {
                end = nums[i];
                if (end == start) {
                    res.add(start + "");
                }
                else {
                    res.add(start + "->" + end);
                }
                start = nums[i+1];
                end = start;
            }
            else {
                end = nums[i+1];
            }
        }
        if (start == end) {
            res.add(start + "");
        }
        else {
            res.add(start + "->" + end);
        }
        System.out.println(res);
        return res;
    }
}
