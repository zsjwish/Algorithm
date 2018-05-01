package leetcode;

import java.util.Stack;

/**
 * created by zsj in 19:35 2018/5/1
 * description:设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 * push(x) -- 将元素x推入栈中
 * pop() -- 删除栈顶的元素
 * top() -- 获取栈顶元素
 * getMin() -- 检索栈中的最小元素
 **/
public class Lee155 {

    public static void main(String[] args) {
        Lee155 lee155 = new Lee155();
        lee155.push(-8);
        lee155.push(0);
        lee155.push(-9);
        lee155.getMin();
        lee155.pop();
        lee155.top();
        lee155.getMin();
    }

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public Lee155() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
        if (stack2.isEmpty()) {
            stack2.push(x);
        }
        else {
            if (x < stack2.peek()) {
                stack2.push(x);
            }
            else {
                stack2.push(stack2.peek());
            }
        }
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        System.out.println(stack1.peek());
        return stack1.peek();
    }

    public int getMin() {
        System.out.println(stack2.peek());
        return stack2.peek();
    }

}
