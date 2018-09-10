package leetcode;

/**
 * created by zsj in 22:14 2018/9/10
 * description:
 **/
public class Lee867 {
    public static void main(String[] args) {

    }

    public static int[][] transpose(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[][] res = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[j][i] = A[i][j];
            }
        }
        return res;
    }
}
