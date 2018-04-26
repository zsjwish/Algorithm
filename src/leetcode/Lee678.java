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
        lee678.checkValidString("(((((***)");
    }

    //方法1，使用两个栈，一个用来存储左括号，一个用来存储星号，当遇到右括号时，如果左括号不为空则弹出左括号，
    //如果左括号栈则说明左括号不够用，再看星号栈是否为空，如果也为空，则说明都不够，返回false。否则弹出星号。
    //当所有的右括号都遍历完后查看左括号和星号栈是否为空，这时候需要比对他们的位置，所以在栈中存储的是左括号和星号所在的位置。
    //如果每次星号的位置在左括号的位置后面说明正确，即“（*”，如果在前面说明是“*（”的情况，说明是错误的，返回false。
    public boolean checkValidString1(String s) {
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
        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (tmp == '(') {
                leftStack.push(i);
            }
            else if (tmp == '*') {
                starStack.push(i);
            }
            else if (tmp == ')') {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                }
                else if(!starStack.isEmpty()) {
                    starStack.pop();
                }
                else {
                    System.out.println("false");
                    return false;
                }
            }
        }
        while (!leftStack.isEmpty() && !starStack.isEmpty()) {
            if (starStack.pop() < leftStack.pop()) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println(leftStack.isEmpty());
        return leftStack.isEmpty();
    }

    /*
    思路：使用两个变量low和high.
    low代表左括号比较多，星号作为右括号时左括号的数量
    high代表右括号比较多，星号作为左括号时左括号的数量
    那么当遇到'('时，low 和 high都会增加
    那么当遇到')'时，如果low不为空，说明左括号比较多，则low--.同时因为high也是代表左括号的数量，所以响应的也减high--
    那么当遇到'*'时，如果low不为空，说明左括号比较多，星号作为右括号则low--.同时high是星号作为左括号，所以high++
    出口：high < 0.说明将*当做左括号也不够，返回false
    同时low==0，如果不等于0，说明将星号视为右括号也不够左括号数量。
    这思路真牛逼
     */
    public boolean checkValidString(String s) {
        int low = 0, high = 0;
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (tmp == '(') {
                low ++;
                high ++;
            }
            else if (tmp == ')') {
                if (low > 0) {
                    low--;
                }
                high--;
            }
            else if (tmp == '*') {
                if (low > 0) {
                    low --;
                }
                high ++;
            }
            if (high < 0) {
                System.out.println(false);
                return false;
            }
        }
        System.out.println(low == 0);
        return low == 0;
    }



}
