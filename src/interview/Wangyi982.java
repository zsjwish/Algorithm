package interview;

import java.util.Scanner;

/**
 * created by zsj in 16:33 2018/9/8
 * description:
 **/
public class Wangyi982 {
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
            System.out.println("0 " + getRes(tmp[i][0],tmp[i][1]));
        }
    }
    public static int getRes(int n, int k) {
        if (n<=2 || k <= 1) {
            return 0;
        }
        else if (k > n/2) {
            return n-k;
        }
        else
            return k-1;
    }
}
