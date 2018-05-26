package recode;

import java.util.Arrays;

/**
 * created by zsj in 16:55 2018/5/26
 * description:给定一个 n × n 的二维矩阵表示一个图像。
 * 将图像顺时针旋转 90 度。
 **/
public class RotateImage {
    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        rotateImage.rotate(new int[][]{ {1,2,3},
                                      {4,5,6},
                                      {7,8,9}});
    }
    public void rotate(int[][] matrix) {
        int row = matrix.length-1;
        int col = matrix[0].length-1;
        for (int i = 0; i < matrix.length/2; i++) {
            int[] tmp = matrix[i];
            matrix[i] = matrix[row-i];
            matrix[row-i] = tmp;
        }
        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i <= row; i++) {
            for (int j = i; j <= col; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
