package leetcode;

/**
 * created by zsj in 11:10 2018/9/9
 * description:我们把符合下列属性的数组 A 称作山脉：
 *A.length >= 3
 * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 **/
public class Lee852 {
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{0,1,2}));
    }
    public static int peakIndexInMountainArray(int[] A) {
        int mid = -1;
        for (int i = 0; i < A.length-1; i++) {
            if (A[i+1] < A[i]) {
                mid = i;
                break;
            }
        }
        if (mid == -1) {
            return -1;
        }
        for (int i = mid; i < A.length-1; i++) {
            if (A[i+1] > A[i]) {
                return -1;
            }
        }
        return mid;
    }

}
