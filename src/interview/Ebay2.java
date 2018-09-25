package interview;

import java.util.Scanner;

/**
 * created by zsj in 19:58 2018/9/25
 * description:Lee629!!!
 **/
public class Ebay2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int res = kInversePairs(n, t);
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= n-t; i++) {
            sb.append(i + " ");
        }
        for (int i = n; i > n-t; i--) {
            sb.append(i + " ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(res);
        System.out.println(sb.toString());
    }

    public static int kInversePairs(int n, int k) {
        if (k > n*(n-1)/2 || k < 0) return 0;
        if (k == 0 || k == n*(n-1)/2) return 1;
        long[][] dp = new long[n+1][k+1];
        dp[2][0] = 1;
        dp[2][1] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i][0] = 1;
            for (int j = 1; j <= Math.min(k, i*(i-1)/2); j++) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
                if (j >= i) dp[i][j] -= dp[i-1][j-i];
            }
        }
        return (int) dp[n][k];
    }
}
