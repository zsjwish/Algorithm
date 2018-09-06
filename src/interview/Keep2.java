package interview;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * created by zsj in 21:08 2018/9/3
 * description:
 **/
public class Keep2 {
    public static void main(String[] args) {
        int weightTotal = 10;
        int[] packageWeight = {0,2,2,6,5,4};
        int[] packageValue = {0,6,3,5,4,6};
        int[][] m = new int[packageWeight.length + 1][weightTotal + 1];
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= weightTotal; j++) {
                if (j < packageWeight[i]) {
                    m[i][j] = m[i-1][j];
                }
                else {
                    m[i][j] = Math.max(m[i-1][j], m[i-1][j-packageWeight[i]] + packageValue[i]);
                }
            }
        }
        System.out.println(Arrays.deepToString(m));
        System.out.println(m[5][10]);

    }
}
