package leetcode;


import java.util.regex.Pattern;

/**
 * created by zsj in 15:39 2018/5/14
 * description:给定一个正整数 N，试求有多少组连续正整数满足所有数字之和为 N?
 * 思路一：暴力，试试
 **/
public class Lee829 {

    public static void main(String[] args) {
        Lee829 lee829 = new Lee829();
        System.out.println(lee829.consecutiveNumbersSum1(5));
        System.out.println(lee829.consecutiveNumbersSum(5));
        System.out.println(lee829.consecutiveNumbersSum1(9));
        System.out.println(lee829.consecutiveNumbersSum(9));
        System.out.println(lee829.consecutiveNumbersSum1(14));
        System.out.println(lee829.consecutiveNumbersSum(14));
        System.out.println(lee829.consecutiveNumbersSum1(3));
        System.out.println(lee829.consecutiveNumbersSum(3));
        String pattern = ".*\\.50*";
        System.out.println(Pattern.matches( pattern, "0.5"));
    }

    private int consecutiveNumbersSum(int N) {
        int start = 1;
        int end = 1;
        int sum = start;
gitad        int res = 0;
        while (end <= N && start <= end){
            if (sum == N) {
                res++;
                end++;
                sum = sum - start + end;
                start++;
            } else if (sum < N) {
                end++;
                sum += end;
            } else {
                sum -= start;
                start++;
            }
        }
        return res;
    }

    public int consecutiveNumbersSum2(int N) {
        int res = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                if (N % i == 0 && N/i >= i/2) {
                    res++;
                }
            }
            else {
                double tmp = (double) N / i;
                String strtmp = String.valueOf(tmp);
                String pattern = ".*\\.50*";
                if (Pattern.matches(pattern, strtmp) && N/i > i/2 ) {
                    res++;
                }
            }
        }
        return res;
    }

    public int consecutiveNumbersSum1(int N) {
        int res = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                if (getSumRes(i, j) == N) {
                    res++;
                }
                else if (getSumRes(i, j) > N) {
                    break;
                }
            }
        }
        return res;
    }

    public int getSumRes(int start, int end) {
        int res = 0;
        while (start <= end) {
            res += start;
            start++;
        }
        return res;
    }

}
