package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * created by zsj in 10:49 2018/4/30
 * description:使用队列实现栈的下列操作：push(x) --元素 x 入栈
 * pop() -- 移除栈顶元素
 * top() -- 获取栈顶元素
 * empty() --返回栈是否为空
 **/
public class Lee225 {

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> quque2 = new LinkedList<>();
    public Lee225() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue1.add(x);
        while (!quque2.isEmpty()) {
            int tmp = quque2.poll();
            queue1.add(tmp);
        }
        Queue<Integer> tmpQueue = new LinkedList<>();
        tmpQueue = queue1;
        queue1 = quque2;
        quque2 = tmpQueue;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return quque2.poll();
    }

    /** Get the top element. */
    public int top() {
        return quque2.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return quque2.isEmpty();
    }

    public static void main(String[] args) {

    }

}
