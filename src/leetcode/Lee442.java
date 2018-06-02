package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * created by zsj in 17:21 2018/5/29
 * description:
 **/
public class Lee442 {

    public static void main(String[] args) {
        Lee442 lee442 = new Lee442();
        int[] nums = new int[]{4,3,2,7,0,2,3,1};
        lee442.swap(nums,1,4);
        System.out.println(Arrays.toString(nums));
        lee442.findDuplicates(nums);
    }
    public List<Integer> findDuplicates1(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0)
                res.add(Math.abs(index+1));
            nums[index] = -nums[index];
        }
        System.out.println(res);
        return res;
    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i) {
                if (nums[i]==nums[nums[i]]) {
                    res.add(nums[i]);
                    i++;
                }
                swap(nums, i, nums[i]);
                i--;
            }
        }
        System.out.println(res);
        return res;
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
