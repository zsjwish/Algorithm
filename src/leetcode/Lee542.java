package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * created by zsj in 21:00 2018/9/20
 * description:
 * 给定一个由 0 和 1 组成的矩阵，找出每个元素到最近的 0 的距离。
 * 两个相邻元素间的距离为 1 。
 **/
public class Lee542 {
    public static void main(String[] args) {
        int[][] num = new int[][] {{0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}};
        updateMatrix(num);
    }

    public static int[][] updateMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] res = new int[row][col];
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    queue.add(new int[]{i, j});
                }
                else {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            for (int[] tmp : dir) {
                int r = cur[0] + tmp[0];
                int c = cur[1] + tmp[1];
                if (r < 0 || r >= row || c < 0 || c >= col) {
                    continue;
                }
                int big = matrix[cur[0]][cur[1]] + 1;
                int curNum = matrix[r][c];
                if (curNum <= big) {
                    continue;
                }
                matrix[r][c] = big;
                queue.add(new int[]{r,c});
            }
        }
        return matrix;
    }
}
