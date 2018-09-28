package leetcode;

/**
 * created by zsj in 18:34 2018/9/28
 * description:
 * 实现 atoi，将字符串转为整数。
 * 该函数首先根据需要丢弃任意多的空格字符，直到找到第一个非空格字符为止。如果第一个非空字符是正号或负号，选取该符号，
 * 并将其与后面尽可能多的连续的数字组合起来，这部分字符即为整数的值。如果第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 * 字符串可以在形成整数的字符后面包括多余的字符，这些字符可以被忽略，它们对于函数没有影响。
 * 当字符串中的第一个非空字符序列不是个有效的整数；或字符串为空；或字符串仅包含空白字符时，则不进行转换。
 * 若函数不能执行有效的转换，返回 0。
 **/
public class Lee8 {
    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("-42"));
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("words and 987"));
        System.out.println(myAtoi("-91283472332"));

    }

    public static int myAtoi(String str) {
        int index = 1;
        StringBuffer sb = new StringBuffer();
        str = str.trim();
        if (str == null || str.length() == 0) {
            return 0;
        }
        int i = 0;
        char positive = str.charAt(0);
        if (positive == '-' || positive == '+') {
            if (positive == '-') {
                index = -1;
            }
            i++;
        }
        long res = 0;
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            res *= 10;
            res += str.charAt(i) - '0';
            if (index * res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            else if (index * res < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (index*res);
    }
}
