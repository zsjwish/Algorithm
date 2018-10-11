package interview;

import java.util.Scanner;

/**
 * created by zsj in 19:55 2018/10/8
 * description:
 **/
public class Wangtao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 0) {
            System.out.println(1);
        }
        if (N == 1) {
            System.out.println(2);
        }
        System.out.println(1 + N + git(N*(N-1))/2);
    }
}
