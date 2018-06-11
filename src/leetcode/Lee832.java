package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 10:52 2018/6/11
 * description:
 **/
public class Lee832 {
    public static void main(String[] args) {
        int[][] A = new int[][]{{1,1,0},{1,0,1},{0,0,0}};
        Lee832 lee832 = new Lee832();
        lee832.flipAndInvertImage(A);
    }
    public int[][] flipAndInvertImage(int[][] A) {
        if (A==null || A.length == 0) {
            return A;
        }
        int row = A.length;
        int col = A[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col/2; j++) {
                int tmp = A[i][j];
                A[i][j] = A[i][col-j-1];
                A[i][col-j-1] = tmp;
            }
        }
        System.out.println(Arrays.deepToString(A));
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (A[i][j] == 0) {
                    A[i][j]=1;
                }
                else {
                    A[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(A));
        return A;
    }
}
