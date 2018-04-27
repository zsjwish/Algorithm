package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * created by zsj in 20:04 2018/4/27
 * description:给定一个大小为 n 的数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。 你的算法应该在O(1)空间中以线性时间运行。
 **/
public class Lee229 {

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,2,3,2,1,1,3};
        Lee229 lee229 = new Lee229();
        lee229.majorityElement(nums);
    }

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new LinkedList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }

        if (nums.length == 1) {
            res.add(nums[0]);
            return res;
        }
        int r1 = nums[0];
        int count1 = 1;
        int r2 = 0;
        int count2 = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == r1 || count1 == 0 && nums[i] != r2) {
                r1 = nums[i];
                count1++;
            }
            else if (nums[i] == r2 || count2 == 0) {
                r2 = nums[i];
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == r1) {
                count1++;
            }
            else if (nums[i] == r2) {
                count2++;
            }
        }
        if (count1 > nums.length / 3) {
            res.add(r1);
        }
        if (count2 > nums.length / 3 && r2 != r1) {
            res.add(r2);
        }

        System.out.println(res);
        return res;

    }

    public List<Integer> majorityElement1(int[] nums) {
        return null;
    }

}
