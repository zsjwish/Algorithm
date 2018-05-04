package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 13:08 2018/5/4
 * description: 包含整数的二维矩阵 M 表示一个图片的灰度。
 * 你需要设计一个平滑器来让每一个单元的灰度成为平均灰度 (向下舍入) ，平均灰度的计算是周围的8个单元和它本身的值求平均，
 * 如果周围的单元格不足八个，则尽可能多的利用它们。
 **/
public class Lee661 {

    public static void main(String[] args) {
        Lee661 lee661 = new Lee661();
        int[][] nums = new int[][]{{1,1,1},
                {1,0,1},
                {1,1,1}};
        int[][] nums1 = new int[][]{{2,3,4},{5,6,7},{8,9,10},{11,12,13},{14,15,16}};
        int[][] nums2 = new int[][] {{2}};
        lee661.imageSmoother(nums2);
    }

    public int[][] imageSmoother(int[][] M) {
        if (M == null || M.length == 0) {
            return M;
        }
        int row = M.length;
        int col = M[0].length;
//        int[][] tmp = new int[row+2][col+2];
        int[][] res = new int[row][col];
//        for (int i = 1; i <= row; i++) {
//            for (int j = 1; j <= col; j++) {
//                 tmp[i][j] = M[i-1][j-1];
//            }
//        }
//        System.out.println(Arrays.deepToString(tmp));
//        for (int i = 1; i <= row; i++) {
//            for (int j = 1; j <= col; j++) {
//                res[i-1][j-1] = tmp[i-1][j-1] + tmp[i-1][j] + tmp[i-1][j+1]
//                        + tmp[i][j-1] + tmp[i][j] + tmp[i][j+1]
//                        + tmp[i+1][j-1] + tmp[i+1][j] + tmp[i+1][j+1];
//            }
//        }
//        System.out.println(Arrays.deepToString(res));
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int count = 0;
                int sum = 0;
                for (int k = i-1; k <= i+1; k++) {
                    for (int l = j-1; l <= j+1; l++) {
                        if (0 <= k && k < row && 0 <= l && l < col) {
                            count++;
                            sum += M[k][l];
                        }

                    }
                }
                res[i][j] = sum / count;
            }
        }
        System.out.println(Arrays.deepToString(res));
        return res;
    }

}
