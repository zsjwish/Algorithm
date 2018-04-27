package leetcode;

/**
 * created by zsj in 23:12 2018/4/27
 * description:给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 **/
public class Lee414 {

    public static void main(String[] args) {
        int[] nums = new int[] {5,2,2};
        Lee414 lee414 = new Lee414();
        lee414.thirdMax(nums);
    }

    public int thirdMax(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length < 3) {
            int max = nums[0];
            for (int i = 1; i < nums.length; i++) {
                max = Math.max(max, nums[i]);
            }
            return max;
        }
        int first =nums[0];
        int second = Integer.MIN_VALUE;
        boolean flagSecond = false;
        int third = Integer.MIN_VALUE;
        boolean flagThird = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == first || (nums[i] == second && flagSecond)) {
                continue;
            }
            if (nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
                if (flagSecond) {
                    flagThird = true;
                }
                flagSecond = true;
            }
            else if (nums[i] > second) {
                third = second;
                second = nums[i];
                if (flagSecond) {
                    flagThird = true;
                }
                flagSecond = true;
            }
            else if (nums[i] >= third) {
                third = nums[i];
                flagThird = true;
            }
        }
        if (third == Integer.MIN_VALUE && !flagThird) {
            System.out.println(first);
            return first;
        }
        System.out.println(third);
        return third;

    }

}
