package leetcode;

/**
 * created by zsj in 13:59 2018/5/22
 * description:给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法。
 * 我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
 * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
 * 思路1：暴力，每次判断前半部分和后半部分是否相同。
 * 思路2；左右各自相加，如果左边大右边+，如果右边大左边+。直到左右相同并且索引相差1；
 **/
public class Lee724 {

    public static void main(String[] args) {
        Lee724 lee724 = new Lee724();
//        System.out.println(lee724.pivotIndex(new int[] {1, 7, 3, 6, 5, 6}));
        System.out.println(lee724.pivotIndex(new int[] {-1,-1,-1,0,1,1}));
    }

    public int pivotIndex1(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (getArraysSum(nums, 0,i-1) == getArraysSum(nums, i+1,nums.length-1)) {
                return i;
            }
        }
        return -1;
    }

    public int getArraysSum(int[] nums, int start, int end) {
        if (start > end) {
            return 0;
        }
        int sum = 0;
        for (int i = start; i <= end ; i++) {
            sum += nums[i];
        }
        return sum;
    }


    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        if (nums.length == 1) return 0;
        int sum = 0;
        for (int tmp : nums) {
            sum += tmp;
        }
        int sumTmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sumTmp == sum - nums[i] - sumTmp) {
                return i;
            }
            sumTmp += nums[i];
        }
        return -1;
    }
}
