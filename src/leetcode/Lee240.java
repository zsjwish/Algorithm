package leetcode;

/**
 * created by zsj in 12:13 2018/5/17
 * description:编写一个高效的算法来搜索 m x n 矩阵中的一个目标值 target。该矩阵具有以下特性：
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 **/
public class Lee240 {

    public static void main(String[] args) {

    }

    public boolean searchMatrix1(int[][] matrix, int target) {
        int i = 0, j = 0;
        while (i < matrix.length && j < matrix[0].length) {
            if (target == matrix[i][j]) {
                return true;
            }
            if (target < matrix[i][j] || j == matrix[0].length-1) {
                i++;
                j = -1;
            }
            j++;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length-1;
        int j = 0;
        while (i >=0 && j < matrix[0].length) {
            if (target == matrix[i][j]) {
                return true;
            }
            if (target > matrix[i][j]) {
                j++;
            }
            else {
                i--;
            }
        }
        return false;
    }
}
