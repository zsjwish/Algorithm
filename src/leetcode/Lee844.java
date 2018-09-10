package leetcode;

import java.util.Stack;

/**
 * created by zsj in 22:23 2018/9/10
 * description:
 **/
public class Lee844 {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
    }

    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (char ch : S.toCharArray()) {
            if (ch == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            }
            else {
                stack1.push(ch);
            }
        }
        for (char ch : T.toCharArray()) {
            if (ch == '#') {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            }
            else {
                stack2.push(ch);
            }
        }
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        while (!stack1.isEmpty()) {
            sb1.append(stack1.pop());
        }
        while (!stack2.isEmpty()) {
            sb2.append(stack2.pop());
        }
        return (sb1.toString()).equals(sb2.toString());
    }

}
