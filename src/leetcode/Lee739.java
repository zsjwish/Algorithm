package leetcode;

import java.util.Arrays;
import java.util.Stack;

/**
 * created by zsj in 14:23 2018/5/26
 * description:根据每日 气温 列表，请重新生成一个列表，对应位置的输入是你需要再等待多久温度才会升高的天数。
 * 如果之后都不会升高，请输入 0 来代替。
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的都是 [30, 100] 范围内的整数。
 **/
public class Lee739 {
    public static void main(String[] args) {
        Lee739 lee739 = new Lee739();
        lee739.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
    }

    /**
     * 使用栈计算
     * @param temperatures
     * @return
     */
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        for (int i = temperatures.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
            System.out.println(stack);
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

    /**
     * 不使用栈，使用数组
     * @param temperatures
     * @return
     */
    public int[] dailyTemperatures1(int[] temperatures) {
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i; j < temperatures.length; j++) {
                if (temperatures[j] > temperatures[i]) {
                    res[i] = j-i;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
