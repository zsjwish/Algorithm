package leetcode;


/**
 * created by zsj in 19:07 2018/4/25
 * description:一个长度为n+1的数组，每个数都是1-n之间的数，有一个数是重复的，请找出这个数。
 * 思路：从头开始，下标为0的元素i，（如果两者不相等）和下标为i的元素j对换（相等则返回这个数）
 * 重复j的元素和他元素作为下标的元素进行比较，相同返回，不相同交换。
 **/
public class Lee287 {

    public static void main(String[] args) {
        int[] nums = new int[] {4,1,2,3,5,4};
        Lee287 lee287 = new Lee287();
        lee287.getSameNum(nums);
    }

    public int getSameNum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            while (i != nums[i]) {
                if (nums[i] == nums[nums[i]]) {
                    System.out.println(nums[i]);
                    return nums[i];
                }
                int tmp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = tmp;
            }
        }
        return 0;
    }
}

