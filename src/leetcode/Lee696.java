package leetcode;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * created by zsj in 11:01 2018/5/24
 * description:给定一个字符串 s，计算具有相同数量0和1的非空(连续)子字符串的数量，
 * 并且这些子字符串中的所有0和所有1都是组合在一起的。
 * 重复出现的子串要计算它们出现的次数。
 **/
public class Lee696 {
    public static void main(String[] args) {
        String s = "00110011";
        Lee696 lee696 = new Lee696();
        lee696.countBinarySubstrings(s);
    }

    public int countBinarySubstrings(String s) {
        int[] group = new int[s.length()];
        int t = 0;
        group[0]=1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                group[t]++;
            }
            else {
                group[++t] = 1;
            }
        }
        System.out.println(Arrays.toString(group));
        int res = 0;
        for (int i = 0; i < group.length-1; i++) {
            res += Math.min(group[i],group[i+1]);
        }
        System.out.println(res);
        return res;

    }

    public int countBinarySubstrings2(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length()-1; i++) {
            if (sb.charAt(i) != sb.charAt(i+1)) {
                sb.insert(i+1,"#");
                i++;
            }
        }
        int res = 0;
        String[] resString = sb.toString().split("#");
        System.out.println(Arrays.toString(resString));
        for (int i = 0; i < resString.length-1; i++) {
            res += Math.min(resString[i].length(), resString[i+1].length());
        }
        System.out.println(res);
        return res;
    }

    public int countBinarySubstrings1(String s) {
        if (s == null || s.length() <= 1) {
            return 0;
        }
        int length = s.length();
        int res = 0;
        for (int i = 1; i <= length / 2; i++) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb1 = new StringBuilder();
            for (int j = 0; j < i; j++) {
                sb.append(0);
                sb1.append(1);
            }
            for (int j = 0; j < i; j++) {
                sb.append(1);
                sb1.append(0);
            }
            for (int j = 0; j <= length-i*2; j++) {
                String tmp = s.substring(j,j+2*i);
                if (tmp.equals(sb.toString()) || tmp.equals(sb1.toString())) {
                    res++;
                }
            }
        }
        System.out.println(res);
        return res;
    }
}
