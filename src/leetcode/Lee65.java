package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 20:58 2018/5/6
 * description:验证给定的字符串是否为数字。
 * "0" => true
 * " 0.1 " => true
 * "abc" => false
 * "1 a" => false
 * "2e10" => true
 * 思路：有限状态机
 *
 **/
public class Lee65 {

    public static void main(String[] args) {
        System.out.println(isInteger("1236"));
        System.out.println(isInteger("1 23"));
        System.out.println(isDecimal("1.23"));
        System.out.println(isDecimal("1.23e-10.2"));
    }

    public static boolean isNumber(String s) {
        return isE(s);
    }

    public static boolean isE(String s) {
        if (s.contains("e") || s.contains("E")) {
            String[] strings = s.split("e|E");
            if (strings.length != 2) {
                return false;
            }
            return isDecimal(strings[0])&&isDecimal(strings[1]);
        }
        return isDecimal(s);
    }

    public static boolean isDecimal(String s) {
        if (s.contains(".")) {
            String[] strings = s.split("\\.");
            if (strings.length != 2) {
                return false;
            }
            return isSignInteger(strings[0]) && isSignInteger(strings[1]);
        }
        return isSignInteger(s);
    }

    public static boolean isSignInteger(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        char sign = s.charAt(0);
        if (sign == '-' || sign == '+') {
            return isInteger(s.substring(1));
        }
        return isInteger(s);
    }

    public static boolean isInteger(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        if (s.charAt(0) == '0') {
            return false;
        }
        int i = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            i++;
        }
        if (i == s.length()) {
            return true;
        }
        return false;
    }

}
