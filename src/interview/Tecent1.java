package interview;

import java.util.Scanner;

/**
 * created by zsj in 10:45 2018/9/16
 * description:
 **/
public class Tecent1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1 || n == 2) {
            System.out.println(n);
            return;
        }
        int minlcm = 1;
        for (int i = 1; i <= n; i++) {
            minlcm = lcm(minlcm, i);
        }
//        for (int i = 1; i <= n ; i++) {
//            minlcm *= i;
//        }
        System.out.println(minlcm);
        int i = n+1;
        int res = 1;
        while (true) {
            res = lcm(res, i);
            if (res % minlcm == 0) {
                System.out.println(i);
                return;
            }
            i++;
        }
    }


    public static int lcm(int a, int b) {
        int m = a, n = b;   //a,b的值要保留到最后相乘，故用m,n来计算
        int t = m % n;
        while (t != 0) {
            m = n;
            n = t;
            t = m % n;
        }                   //此处跳出while时，n的值即a,b的最大公约数
        int l = a * b / n;
        return l;
    }

}
