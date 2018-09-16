package interview;

import java.util.Arrays;
import java.util.Scanner;

/**
 * created by zsj in 11:36 2018/9/16
 * description:
 **/
public class Tecent2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int city = sc.nextInt();
        int line = sc.nextInt();
        int[][] res = new int[city+1][city+1];
        int[][] input = new int[line][2];
        for (int i = 0; i < line; i++) {
            input[i][0] = sc.nextInt();
            input[i][1] = sc.nextInt();
            res[input[i][0]][input[i][1]] = 1;
        }
        for (int i = 0; i <= city; i++) {
            for (int j = 0; j <=city ; j++) {
                if (res[i][j] == 1) {
                    res = hoop(res, i, j);
                }
            }
        }
        int answer = 0;
        for (int i = 1; i <= city; i++) {
            int in = 0;
            int out = 0;
            for (int j = 1; j <= city; j++) {
                if (res[i][j] == 1) {
                    out++;
                }
                else if (res[j][i] == 1) {
                    in++;
                }
            }
            if (in > out) {
                answer++;
            }
        }
        System.out.println(answer);

    }

    public static int[][] hoop(int[][] res, int row , int col) {
        for (int i = 0; i < res[0].length; i++) {
            if (res[col][i] == 1) {
                res[row][i] = 1;
            }
        }
        return res;
    }
}
