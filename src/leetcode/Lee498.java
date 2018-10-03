package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * created by zsj in 12:26 2018/10/3
 * description:给定一个含有 M x N 个元素的矩阵（M行，N列），请以对角线遍历的顺序返回这个矩阵中的所有元素，对角线遍历如下图所示。
 * 示例:
 * 输入:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * 输出:  [1,2,4,7,5,3,6,8,9]
 **/
public class Lee498 {
    public static void main(String[] args) {
        findDiagonalOrder(new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        });
        System.out.println(Arrays.toString(new int[0]));
    }


    public static int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int[] res = new int[row * col];
        int index = 0;
        for (int i = 0; i < col + row - 1; i++) {
            if (i % 2 == 1) {
                for (int j = Math.min(col - 1, i); j >= 0 && i - j < row; j--) {
                    res[index++] = matrix[i-j][j];
                }
            }
            else {
                for (int j = Math.min(row-1, i); j >= 0 && i - j < col; j--) {
                    res[index++] = matrix[j][i-j];
                }
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static int[] findDiagonalOrder1(int[][] matrix) {
        if (matrix == null && matrix.length == 0) {
            return new int[0];
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int[] res = new int[row * col];
        List<List<Integer>> list = new LinkedList<>();
        for (int i = 0; i < col + row - 1; i++) {
            list.add(new LinkedList<>());
            for (int j = col - 1; j >= 0; j--) {
                if (i - j >= 0 && i - j < row) {
                    list.get(i).add(matrix[i-j][j]);
                }
            }
        }
        System.out.println(list);
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                for (int j = list.get(i).size() - 1; j >= 0; j--) {
                    res[index++] = list.get(i).get(j);
                }
            }
            else {
                for (int j = 0; j < list.get(i).size(); j++) {
                    res[index++] = list.get(i).get(j);
                }
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
