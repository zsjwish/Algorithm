package leetcode;

/**
 * created by zsj in 22:47 2018/5/13
 * description:峰值元素是一个大于其邻居的元素。
 * 给定一个输入数组nums，其中nums[i] ≠ nums[i+1]，找到一个峰值元素并返回其索引。
 * 数组可能包含多个峰值，在这种情况下，将索引返回到任何一个峰值都可以。
 * 你可以想象得到nums[-1] = nums[n] = -∞
 **/
public class Lee162 {

    public static void main(String[] args) {

    }

    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] >  nums[i+1]) {
                return i;
            }
        }
        return nums.length-1;
    }

}
