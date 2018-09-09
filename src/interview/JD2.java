package interview;

import java.util.Arrays;
import java.util.Scanner;

/**
 * created by zsj in 19:52 2018/9/9
 * description:
 **/
public class JD2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[]A = new int[n];
        int[]B = new int[n];
        int[]C = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
            B[i] = scanner.nextInt();
            C[i] = scanner.nextInt();
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i!=j) {
                    if (A[i] < A[j] && B[i] < B[j] && C[i] < C[j]) {
                        res++;
                        break;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
