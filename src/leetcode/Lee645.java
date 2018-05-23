package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * created by zsj in 13:45 2018/5/23
 * description:集合 S 包含从1到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，
 * 导致集合丢失了一个整数并且有一个元素重复。
 * 给定一个数组 nums 代表了集合 S 发生错误后的结果。你的任务是首先寻找到重复出现的整数，
 * 再找到丢失的整数，将它们以数组的形式返回。
 **/
public class Lee645 {

    public static void main(String[] args) {

    }

    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] res = new int[2];
        for (int tmp : nums) {
            if (!set.add(tmp)) {
                res[0] = tmp;
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                res[1] = i;
            }
        }
        return res;
    }

}
