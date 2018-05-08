package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 14:59 2018/5/8
 * description:在二维数组grid中，grid[i][j]代表位于某处的建筑物的高度。
 * 我们被允许增加任何数量（不同建筑物的数量可能不同）的建筑物的高度。
 * 高度 0 也被认为是建筑物。最后，从新数组的所有四个方向（即顶部，底部，左侧和右侧）观看的“天际线”必须与原始数组的天际线相同。
 * 城市的天际线是从远处观看时，由所有建筑物形成的矩形的外部轮廓。
 **/
public class Lee807 {

    public static void main(String[] args) {
        int[][] grid = new int[][]{{3,0,8,4},{2,4,5,7}};
        Lee807 lee807 = new Lee807();
        lee807.maxIncreaseKeepingSkyline(grid);
    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];
        for (int i = 0; i < row.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > max) {
                    max = grid[i][j];
                }
            }
            row[i] = max;
        }
        for (int i = 0; i < col.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] > max) {
                    max = grid[j][i];
                }
            }
            col[i] = max;
        }
        System.out.println(Arrays.toString(row));
        System.out.println(Arrays.toString(col));
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                res += Math.min(row[i],col[j]) - grid[i][j];
            }
        }
        System.out.println(Arrays.deepToString(grid));
        return res;
    }

}
