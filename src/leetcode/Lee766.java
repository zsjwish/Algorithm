package leetcode;

/**
 * created by zsj in 11:38 2018/4/28
 * description:如果一个矩阵的每一方向由左上到右下的对角线上具有相同元素，那么这个矩阵是托普利茨矩阵。
 * 给定一个 M x N 的矩阵，当且仅当它是托普利茨矩阵时返回 True。
 * 思路：对于第一行每个元素，如果i+1,j+1在数组范围内，取得数据对比是否相等。
 **/
public class Lee766 {

    public static void main(String[] args) {
        int[][] matrix = new int[][] {{22,0,94,45,46,96},{10,22,80,94,45,46}};
        Lee766 lee766 = new Lee766();
        lee766.isToeplitzMatrix(matrix);

    }


    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < col - 1; j++) {
                if (i + 1 < row && j + 1 < col && matrix[i][j] == matrix[i + 1][j + 1]) {
                        continue;
                    }
                else {
                    System.out.println(false);
                    return false;
                }
            }
        }
        System.out.println(true);
        return true;
    }
}
