package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 10:18 2018/5/4
 * description:给定两个表示复数的字符串。
 * 返回表示它们乘积的字符串。注意，根据定义 i2 = -1 。
 **/
public class Lee537 {

    public static void main(String[] args) {
        Lee537 lee537 = new Lee537();
        lee537.complexNumberMultiply("1+-1i","1+-1i");
    }

    public String complexNumberMultiply(String a, String b) {
        int[] r1 = parseString(a);
        int[] r2 = parseString(b);
        StringBuffer sb = new StringBuffer();
        int res1 = r1[0]*r2[0] - r1[1]*r2[1];
        int res2 = r1[0]*r2[1] + r1[1]*r2[0];
        sb.append(res1);
        sb.append("+");
        sb.append(res2);
        sb.append("i");
        System.out.println(sb.toString());
        return sb.toString();
    }

    public int[] parseString(String s) {
        String[] strs = s.split("\\+|i");
        int[] res = new int[2];
        res[0] = Integer.valueOf(strs[0]);
        res[1] = Integer.valueOf(strs[1]);
        return res;
    }

}
