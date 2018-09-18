package leetcode;

import com.sun.deploy.util.StringUtils;

import java.util.*;

/**
 * created by zsj in 22:52 2018/9/16
 * description:
 * 给定一个N叉树，返回其节点值的后序遍历。
 **/
public class Lee590 {
    public static void main(String[] args) {


    }

    public static List<Integer> postorder(Node root) {
        List<Integer> list = new LinkedList<>();
        if (root == null) {
            return list;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node tmp = stack.pop();
            list.add(tmp.val);
            for (Node n : tmp.children) {
                stack.push(n);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
