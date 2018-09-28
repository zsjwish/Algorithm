package leetcode;

/**
 * created by zsj in 10:55 2018/9/28
 * description:在 N * N 的网格中，我们放置了一些与 x，y，z 三轴对齐的 1 * 1 * 1 立方体。
 * 每个值 v = grid[i][j] 表示 v 个正方体叠放在单元格 (i, j) 上。
 * 现在，我们查看这些立方体在 xy、yz 和 zx 平面上的投影。
 * 投影就像影子，将三维形体映射到一个二维平面上。
 * 在这里，从顶部、前面和侧面看立方体时，我们会看到“影子”。
 * 返回所有三个投影的总面积。
 **/
public class Lee883 {
    public static void main(String[] args) {
        projectionArea(new int[][]{{1,0},{0,2}});
        projectionArea(new int[][]{{1,2},{3,4}});
        projectionArea(new int[][]{{1,1,1},{1,0,1},{1,1,1}});
        projectionArea(new int[][]{{2,2,2},{2,1,2},{2,2,2}});
    }

    public static int projectionArea(int[][] grid) {
        int sum = 0;
        if (grid == null || grid.length == 0) {
            return sum;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    sum ++;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            int tmp1 = 0;
            int tmp2= 0;
            for (int j = 0; j < grid[0].length; j++) {
                tmp1 = Math.max(tmp1, grid[i][j]);
                tmp2 = Math.max(tmp2, grid[j][i]);
            }
            sum += tmp1;
            sum += tmp2;
        }
        System.out.println(sum);
        return sum;
    }
}
