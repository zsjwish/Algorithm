package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 10:12 2018/5/5
 * description:给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
 * 思路：大数相乘
 **/
public class Lee43 {
    public static void main(String[] args) {
        Lee43 lee43 = new Lee43();
        lee43.multiply("1","11");
    }

    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] res = new int[len1 + len2];
        char[] tmp1 = num1.toCharArray();
        char[] tmp2 = num2.toCharArray();
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                int n1 = tmp1[i] - '0';
                int n2 = tmp2[j] - '0';
                res[i + j + 1] += n1 * n2;
            }
        }
        for (int i = res.length - 1; i > 0; i--) {
            res[i-1] += res[i] / 10;
            res[i] %= 10;
        }
        StringBuffer sb = new StringBuffer();
        boolean flag = false;
        for (int i = 0; i < res.length; i++) {
            if (res[i] == 0 && !flag) {
                continue;
            }
            sb.append(res[i]);
            flag = true;
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
