package leetcode;

/**
 * created by zsj in 20:02 2018/10/1
 * description:
 **/
public class Lee908 {
    public static void main(String[] args) {

    }

    public int smallestRangeI(int[] A, int K) {
        if (A == null || A.length == 1) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int tmp : A) {
            if (tmp < min) {
                min = tmp;
            }
            if (tmp > max) {
                max = tmp;
            }
        }
        if (max - min <= 2*K) {
            return 0;
        }
        return max - min - 2*K;
    }
}
