package leetcode;

/**
 * created by zsj in 15:54 2018/5/10
 * description:
 * 给定一个长度为 n 的非空整数数组，找到让数组所有元素相等的最小移动次数。每次移动可以使 n - 1 个元素增加 1。
 * 这是一个数学问题，假设有n个数，计算了K次，最后每个数为T。则，
 * 之前的总和sum+k*(n-1) = T*n
 * 并且 之前的最小值min + k = T
 * 所以就是个计算问题，合并两个公式，k = sum - min*n
 * */
public class Lee453 {

    public static void main(String[] args) {

    }

    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int tmp : nums) {
            if (tmp < min) {
                min = tmp;
            }
            sum += tmp;
        }
        return sum - min*nums.length;
    }


}
