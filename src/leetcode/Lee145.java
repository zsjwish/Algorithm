package leetcode;

import java.util.*;

/**
 * created by zsj in 9:47 2018/9/18
 * description:给定一个二叉树，返回它的 后序 遍历
 **/
public class Lee145 {
    public static void main(String[] args) {

    }

    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        if (root.left == null && root.right == null) {
            res.add(root.val);
            return res;
        }
        else {
            res.addAll(postorderTraversal1(root.left));
            res.addAll(postorderTraversal1(root.right));
            res.add(root.val);
            return res;
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new LinkedList<>();
        if (root == null) {
            return list;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode tmp = stack.pop();
            list.add(tmp.val);
            if (tmp.left != null) {
                stack.push(tmp.left);
            }
            if (tmp.right != null) {
                stack.push(tmp.right);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
