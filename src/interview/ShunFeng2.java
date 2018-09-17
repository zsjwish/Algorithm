package interview;

import java.util.Scanner;

/**
 * created by zsj in 19:56 2018/9/17
 * description:
 **/
public class ShunFeng2 {
    static int res = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(getRes(a, b));
    }
    public static int getRes(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (!sameturn(b, a[i],a[j])) {
                    res++;
                }
            }
        }
        return res;
    }

    public static boolean sameturn(int[] b, int start, int end) {
        boolean s = false;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == end) {
                return s;
            }
            if (b[i] == start) {
                s = true;
            }
        }
        return s;
    }
}
