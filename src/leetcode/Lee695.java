package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 16:33 2018/4/28
 * description:给定一个包含了一些 0 和 1的非空二维数组 grid ,
 * 一个 岛屿 是由四个方向 (水平或垂直) 的 1 (代表土地) 构成的组合。你可以假设二维矩阵的四个边缘都被水包围着。
 * 思路：dp
 **/
public class Lee695 {

    public static void main(String[] args) {
        int[][] nums = new int[][] {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                                    {0,0,0,0,0,0,0,1,1,1,0,0,0},
                                    {0,1,1,0,1,0,0,0,0,0,0,0,0},
                                    {0,1,0,0,1,1,0,0,1,0,1,0,0},
                                    {0,1,0,0,1,1,0,0,1,1,1,0,0},
                                    {0,0,0,0,0,0,0,0,0,0,1,0,0},
                                    {0,0,0,0,0,0,0,1,1,1,0,0,0},
                                    {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        Lee695 lee695 = new Lee695();
        lee695.maxAreaOfIsland(nums);
    }

    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        int tmp = 0, max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    tmp = dfs(i, j, row, col, grid, 0);
                    max = Math.max(max, tmp);
                }
            }
        }
        System.out.println(max);
        return max;
    }

    public int dfs(int i, int j, int row, int col, int[][] grid, int tmp_area) {
        if (i < 0 || i >= row || j < 0 || j >= col || grid[i][j] ==0) {
            return tmp_area;
        }
        grid[i][j] = 0;
        tmp_area += 1;
        tmp_area = dfs(i+1, j, row, col, grid, tmp_area);
        tmp_area = dfs(i-1, j, row, col, grid, tmp_area);
        tmp_area = dfs(i, j+1, row, col, grid, tmp_area);
        tmp_area = dfs(i, j-1, row, col, grid, tmp_area);
        return tmp_area;
    }

}
