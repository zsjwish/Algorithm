package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 20:10 2018/5/22
 * description:给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。
 * 网格中的格子水平和垂直方向相连（对角线方向不相连）。
 * 整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。
 * 岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。
 * 格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周长。
 **/
public class Lee463 {

    public static void main(String[] args) {
        Lee463 lee463 = new Lee463();
        int[][] grid = new int[][] {{0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}};
        lee463.islandPerimeter(grid);
    }

    public int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        int[][] res = new int[row+2][col+2];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[i+1][j+1] = grid[i][j];
            }
        }
        System.out.println(Arrays.deepToString(res));
        int sum = 0;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (res[i][j] == 1) {
                    if (res[i - 1][j] == 0) sum++;
                    if (res[i][j - 1] == 0) sum++;
                    if (res[i + 1][j] == 0) sum++;
                    if (res[i][j + 1] == 0) sum++;
                }
            }
        }
        System.out.println(sum);
        return sum;
    }

}
