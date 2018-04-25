package leetcode;

import java.util.Stack;

/**
 * created by zsj in 22:21 2018/4/25
 * description:给定一个只包含三种字符的字符串：（ ，） 和 *，写一个函数来检验这个字符串是否为有效字符串。有效字符串具有如下规则：
 任何左括号 ( 必须有相应的右括号 )。
 任何右括号 ) 必须有相应的左括号 ( 。
 左括号 ( 必须在对应的右括号之前 )。
 * 可以被视为单个右括号 ) ，或单个左括号 ( ，或一个空字符串。
 一个空字符串也被视为有效字符串。
 **/
public class Lee678 {

    public static void main(String[] args) {
        Lee678 lee678 = new Lee678();
        lee678.checkValidString("\"(())()())(*))(((((())()*))**))**()(*(()()*)(**(())()**)((**(()(((()()**)())*(*))(())()()*");
    }

    public boolean checkValidString(String s) {
        int left = 0, right = 0, star = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                left++;
            }
            else if (c == ')') {
                right++;
            }
            else if (c == '*') {
                star++;
            }
        }

        if (star < Math.abs(left - right)) {
            System.out.println("false");
            return false;
        }

        Stack<Character> stack = new Stack<>();
        if (left == right) {
            for (int i = 0; i < s.length(); i++) {
                char tmp = s.charAt(i);
                if (tmp == '(') {
                    stack.push(tmp);
                }
                if (tmp == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    else {
                        System.out.println("false");
                        return false;
                    }
                }
            }
            if (stack.isEmpty()) {
                System.out.println("true");
                return true;
            }
        }
        else if (left > right) {
            int numPop = 0;
            for (int i = 0; i < s.length(); i++) {
                char tmp = s.charAt(i);
                if (tmp == '(') {
                    stack.push(tmp);
                }
                else if (tmp == ')' || tmp == '*') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    else {
                        numPop++;
                    }
                }
            }
            if (stack.isEmpty() && right + star - left == numPop) {
                System.out.println("true");
                return true;
            }
            System.out.println("false");
            return false;
        }

        else if (right > left) {
            int numPop = 0;
            for (int i = 0; i < s.length(); i++) {
                char tmp = s.charAt(i);
                if (tmp == '(' || tmp == '*') {
                    stack.push(tmp);
                }
                else if (tmp == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    else {
                        System.out.println("false");
                        return false;
                    }
                }
            }
            if (stack.size()!=numPop) {
                System.out.println("false");
                return false;
            }
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

}
