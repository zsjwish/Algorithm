package interview;

import java.util.Scanner;

/**
 * created by zsj in 16:08 2018/9/8
 * description:
 **/
public class Wangyi981 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int[][] tmp = new int[row][2];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 2; j++) {
                tmp[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            System.out.println(getRes(tmp[i][0], tmp[i][1]));
        }
    }

    public static int getRes(int n, int m) {
        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i>0&&i<n) {
                    res[i-1][j] = (res[i-1][j]+1)%2;
                }
                if (i<n-1&&i>=0) {
                    res[i+1][j] = (res[i+1][j]+1)%2;
                }
                if (j>0&&j<m) {
                    res[i][j-1] = (res[i][j-1]+1)%2;
                }
                if (j < m-1 && j>=0) {
                    res[i][j+1] = (res[i][j+1]+1)%2;
                }
                if (i>0 && j>0 && i<n &&j<m) {
                    res[i-1][j-1] = (res[i-1][j-1]+1)%2;
                }
                if (i>0 && j<m-1 &&i<n&&j>=0) {
                    res[i-1][j+1] = (res[i-1][j+1]+1)%2;
                }
                if (i<n-1 && j>0 &&i>=0 &&j<m) {
                    res[i+1][j-1] = (res[i+1][j-1]+1)%2;
                }
                if (i<n-1 && j<m-1 && i>=0 &&j>=0) {
                    res[i+1][j+1] = (res[i+1][j+1]+1)%2;
                }
                res[i][j] = (res[i][j] + 1)%2;
            }
        }
        int num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (res[i][j] == 1) {
                    num++;
                }
            }
        }
        return num;
    }
}
