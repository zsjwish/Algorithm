package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * created by zsj in 22:25 2018/9/16
 * description:给定一个N叉树，返回其节点值的前序遍历。
 **/
public class Lee589 {
    public static void main(String[] args) {

    }

    public static List<Integer> preorder(Node root) {
        if (root == null) {
            return null;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        List<Integer> res = new LinkedList<>();
        while (!stack.isEmpty()) {
            Node n = stack.pop();
            res.add(n.val);
            List<Node> tmp = n.children;
            for (int i = tmp.size()-1; i >= 0; i--) {
                stack.push(tmp.get(i));
            }
        }
        System.out.println(res);
        return res;
    }
}
