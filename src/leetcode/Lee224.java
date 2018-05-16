package leetcode;

import java.util.Stack;

/**
 * created by zsj in 16:23 2018/5/16
 * description:实现一个基本的计算器来计算一个简单的字符串表达式的值。
 * 字符串表达式可以包含左括号 ( ，右括号 )，加号 + ，减号 -，非负整数和空格  。
 * 思路：使用栈，遇到（进栈，遇到+，—计算出站后再进栈
 * */
//---------------------------------------------------------------未完成
public class Lee224 {

    public static void main(String[] args) {

    }

    public int calculate(String s) {
        int i = 0;
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {
            sb = null;
            while (isInteger(s.charAt(i))) {
                sb.append(s.charAt(i));
                i++;
            }
            if (!stack.isEmpty() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {

            }
        }
        return 0;
    }
    public boolean isInteger(char c) {
        return c >= '0' && c <= '9';
    }
}
