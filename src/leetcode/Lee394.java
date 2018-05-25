package leetcode;

import java.util.Stack;

/**
 * created by zsj in 15:31 2018/5/25
 * description:给定一个经过编码的字符串，返回它解码后的字符串。
 * 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
 * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
 * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
 **/
public class Lee394 {

    public static void main(String[] args) {
        Lee394 lee394 = new Lee394();
//        System.out.println(lee394.decodeString("100[leetcode]"));
//        System.out.println(lee394.decodeString("3[a2[c]]"));
//        System.out.println(lee394.decodeString("2[abc]3[cd]ef"));
        System.out.println(lee394.decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"));
    }

    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        String ingeter = "0123456789";
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            switch (tmp) {
                case '[':
                    StringBuilder sbtmp = new StringBuilder();
                    while (!stack.isEmpty() && ingeter.contains(stack.peek())) {
                        sbtmp.append(stack.pop());
                    }
                    stack.push(sbtmp.reverse().toString());
                    stack.push("[");
                    break;
                case ']':
                    StringBuilder sb = new StringBuilder();
                    while (stack.peek() != "[") {
                        sb.insert(0,stack.pop());
                    }
                    stack.pop();
                    int times = Integer.valueOf(stack.pop());
                    StringBuilder pushSb = new StringBuilder();
                    for (int j = 0; j < times; j++) {
                        pushSb.append(sb);
                    }
                    stack.push(pushSb.toString());
                    break;
                default:
                    stack.push(tmp + "");
            }
        }
        StringBuilder res = new StringBuilder();
        String[] resString = new String[stack.size()];
        int t = 0;
        while (!stack.isEmpty()) {
            resString[t++] =  stack.pop();
        }
        for (int i = resString.length-1; i >=0; i--) {
            res.append(resString[i]);
        }
        return res.toString();
    }

}
