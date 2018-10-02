package leetcode;

import java.util.Stack;

/**
 * created by zsj in 23:03 2018/10/2
 * description:计算给定二叉树的所有左叶子之和。
 **/
public class Lee404 {
    public static void main(String[] args) {

    }

    public int sumOfLeftLeaves(TreeNode root) {
        int res = 0;
        if (root == null) {
            return res;
        }
        Stack<TreeNode> leftStack = new Stack<>();
        Stack<TreeNode> otherStack = new Stack<>();
        otherStack.add(root);
        while (!leftStack.isEmpty() || !otherStack.isEmpty()) {
            for (int i = leftStack.size() - 1; i >= 0; i--) {
                TreeNode tmp = leftStack.pop();
                if (isLeaves(tmp)) {
                    res += tmp.val;
                }
                if (tmp.left != null) {
                    leftStack.add(tmp.left);
                }
                if (tmp.right != null) {
                    otherStack.add(tmp.right);
                }
            }
            for (int i = otherStack.size() - 1; i >= 0; i--) {
                TreeNode tmp = otherStack.pop();
                if (tmp.left != null) {
                    leftStack.add(tmp.left);
                }
                if (tmp.right != null) {
                    otherStack.add(tmp.right);
                }
            }
        }
        return res;
    }

    public static boolean isLeaves(TreeNode root) {
        if (root != null && root.left == null && root.right == null) {
            return true;
        }
        return false;
    }
}
