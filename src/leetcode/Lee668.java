package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 10:11 2018/5/10
 * description:几乎每一个人都用 乘法表。但是你能在乘法表中快速找到第k小的数字吗？
 * 给定高度m 、宽度n 的一张 m * n的乘法表，以及正整数k，你需要返回表中第k 小的数字。
 **/
public class Lee668 {

    public static void main(String[] args) {
        Lee668 lee668 = new Lee668();
        lee668.findKthNumber(2, 3, 5);
    }

    public int findKthNumber(int m, int n, int k) {
        int low = 1, high = m*n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (!hasEnoughNumber(mid, m, n, k)) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        System.out.println(low);
        return low;

    }
    public boolean hasEnoughNumber(int x, int m, int n, int k) {
        int res = 0;
        for (int i = 1; i <= m; i++) {
            res+= Math.min(x/i, n);
        }
        return res >= k;
    }

    public int findKthNumber1(int m, int n, int k) {
        int[] res = new int[m*n];
        int cur = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                res[cur++] = i*j;
            }
        }
        Arrays.sort(res);
        System.out.println(res[k-1]);
        return res[k-1];
    }



}
