package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 21:35 2018/5/6
 * description:给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 * 注意：
 * num1 和num2 的长度都小于 5100.
 * num1 和num2 都只包含数字 0-9.
 * num1 和num2 都不包含任何前导零。
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
 **/
public class Lee415 {

    public static void main(String[] args) {
        Lee415 lee415 = new Lee415();
        lee415.addStrings("0","998");
    }

    public String addStrings(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int max = Math.max(len1, len2) + 1;
        int[] resInt = new int[max];
        int i = 0, j = 0;
        while (i < len1 || j < len2) {
            int tmp1,tmp2;
            if (i >= len1) {
                tmp1 = 0;
            }
            else {
                tmp1 = Integer.valueOf(num1.charAt(len1 - i - 1)+"");
            }
            i++;
            if (j >= len2) {
                tmp2 = 0;
            }
            else {
                tmp2 = Integer.valueOf(num2.charAt(len2 - j - 1)+"");
            }
            j++;
            resInt[--max] = tmp1 + tmp2;
        }
        System.out.println(Arrays.toString(resInt));
        for (int k = resInt.length - 1; k > 0; k--) {
            resInt[k-1] += resInt[k] / 10;
            resInt[k] %= 10;
        }
        System.out.println(Arrays.toString(resInt));
        StringBuffer sb = new StringBuffer();
        boolean start = false;
        for (int k = 0; k < resInt.length; k++) {
            if (!start && resInt[k] == 0) {
                continue;
            }
            else {
                sb.append(resInt[k]);
                start = true;
            }
        }
        if (sb.length() == 0) {
            return "0";
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
