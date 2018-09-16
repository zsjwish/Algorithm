package interview;

        import java.util.Scanner;

/**
 * created by zsj in 10:53 2018/9/16
 * description:
 **/
public class Tecent3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] res = new int[N][3];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(getres(res[i]));
        }

    }
    public static String getres(int[] tmp) {
        int A = tmp[0];
        int B = tmp[1];
        int C = tmp[2];
        for (int i = 1; i < 200; i++) {
            if ((i*A-C)%B == 0) {
                return "YES";
            }
        }
        return "NO";
    }
}
