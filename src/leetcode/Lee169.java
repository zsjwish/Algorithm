package leetcode;

/**
 * created by zsj in 17:00 2018/4/27
 * description:给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 **/
public class Lee169 {

    public static void main(String[] args) {
        int[] nums = new int[] {3,2,3};
        Lee169 lee169 = new Lee169();
        lee169.majorityElement(nums);

    }

    public int majorityElement(int[] nums) {
        int count = 1;
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (count == 0 || nums[i] == res) {
                res = nums[i];
                count++;
            }
            else {
                count--;
            }
        }
        System.out.println(res);
        return res;
    }

}
