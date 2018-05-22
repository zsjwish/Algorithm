package leetcode;

/**
 * created by zsj in 16:22 2018/5/22
 * description:给定一个二进制数组， 计算其中最大连续1的个数。
 **/
public class Lee485 {
    public static void main(String[] args) {
        Lee485 lee485 = new Lee485();
        System.out.println(lee485.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1,1}));
        System.out.println(lee485.findMaxConsecutiveOnes1(new int[]{1,1,0,1,1,1,1}));
    }

    public int findMaxConsecutiveOnes1(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int tmp : nums) {
            sb.append(tmp);
        }
        String[] strings = sb.toString().split("0");
        int max = 0;
        for (int i = 0; i < strings.length; i++) {
            max = Math.max(max, strings[i].length());
        }
        return max;
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int low = 0, high = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                max = Math.max(max, high - low);
                high++;
                low = high;
            }
            else {
                high++;
            }
        }
        max = Math.max(max, high - low);
        return max;
    }


}
