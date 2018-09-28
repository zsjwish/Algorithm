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
//        System.out.println(isE("3."));
//        System.out.println(isE(".2"));
//        System.out.println(isE("0.."));
        System.out.println(isNumber("4e1.e"));
    }

    public static boolean isNumber(String s) {
        s = s.trim();
        return isE(s);
    }

    public static boolean isE(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        int enums = 0;
        for (char tmp : s.toCharArray()) {
            if (tmp == 'e' || tmp == 'E') {
                enums++;
            }
            if (enums > 1) {
                return false;
            }
        }
        if (s.contains("e") || s.contains("E")) {
            String[] strings = s.split("e|E");
            if (strings.length != 2) {
                return false;
            }
            //题目说e指数不能为小数
//            return isSignDecimal(strings[0])&&isSignDecimal(strings[1]);
            return isSignDecimal(strings[0])&&isSignInteger(strings[1]);
        }
        return isSignDecimal(s);
    }


    public static boolean isSignDecimal(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            return isDecimal(s.substring(1));
        }
        return isDecimal(s);
    }

    public static boolean isDecimal(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        int point = 0;
        for (char tmp : s.toCharArray()) {
            if (tmp == '.') {
                point++;
            }
            if (point > 1) {
                return false;
            }
        }
        if (s.contains(".")) {
            String[] strings = s.split("\\.");
            int length = strings.length;
            if (strings.length == 1) {
                return isSignInteger(strings[0]);
            }
            if (length != 2) {
                return false;
            }
            if (strings[0].length() == 0) {
                return isInteger(strings[1]);
            }

            return isSignInteger(strings[0]) && isInteger(strings[1]);
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
        if (s.length() == 1 && s.charAt(0) == '0') {
            return true;
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
