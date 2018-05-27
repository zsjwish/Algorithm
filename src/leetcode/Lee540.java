package leetcode;

/**
 * created by zsj in 13:41 2018/5/27
 * description:给定一个只包含整数的有序数组，每个元素都会出现两次，唯有一个数只会出现一次，找出这个数。
 **/
public class Lee540 {
    public static void main(String[] args) {

    }
    public int singleNonDuplicate(int[] nums) {
        int res = 0;
        for (int tmp : nums) {
            res ^= tmp;
        }
        return res;
    }
}
