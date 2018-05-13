package leetcode;

/**
 * created by zsj in 20:39 2018/5/13
 * description:
 * 在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。
 * 思路：dp。计算某一块的上一块和前一块中较小的一个。就是能形成正方形最大的。
 **/
public class Lee221 {

    public static void main(String[] args) {
        char[][] nums = new char[][]{{'1','0','1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                { '1', '1', '1', '1', '1'},
                { '1', '0', '0', '1', '0'}};
        char[][] nums1 = new char[][]{{'1','0','1','0'},{'1','0','1','1'},{'1','0','1','1'},{'1','1','1','1'}};
        Lee221 lee221 = new Lee221();
        lee221.maximalSquare(nums1);
    }
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int max = 0;
        if (matrix.length == 1) {
            for (int i = 0; i < matrix[0].length; i++) {
                max = Math.max(max, matrix[0][i]-'0');
            }
            return max*max;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] res = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[i][j] = matrix[i][j] - '0';
            }
        }
        for (int i = 0; i < row; i++) {
            max = Math.max(res[i][0],max);
        }
        for (int i = 0; i < col; i++) {
            max = Math.max(res[0][i],max);
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (res[i][j]!=0) {
                    res[i][j] = Math.min(Math.min(res[i - 1][j], res[i][j - 1]),res[i-1][j-1]) + 1;
                    max = Math.max(max, res[i][j]);
                }
            }
        }
        System.out.println(max * max);
        return max * max;
    }

}
