package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 11:57 2018/9/9
 * description:
 **/
public class Lee718 {
    public static void main(String[] args) {
        System.out.println(findLength(new int[]{1,2,3,2,1}, new int[]{9,6,5,8,7}));

    }
    public static int findLength1(int[] A, int[] B) {
        String a = changeToString(A);
        String b = changeToString(B);
        int bLen = b.length();
        int maxSame = 0;
        for (int i = 0; i < bLen; i++) {
            for (int j = 0; j + i < bLen; j++) {
                String tmp = b.substring(i, j+i+1);
                if (a.contains(tmp)) {
                    maxSame = Math.max(maxSame, tmp.length());
                }
            }
        }
        return maxSame;
    }

    public static String changeToString(int[] a) {
        StringBuffer sb = new StringBuffer();
        for (int tmp : a) {
            sb.append(tmp);
        }
        return sb.toString();
    }

    public static int findLength(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[][] dp = new int[n+1][m+1];
        int maxN = 0;
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
                else {
                    if (A[i-1] == B[j-1]) {
                        dp[i][j] = 1 + dp[i-1][j-1];
                        maxN = Math.max(maxN, dp[i][j]);
                    }
                }
            }
        }
        return maxN;
    }
}
