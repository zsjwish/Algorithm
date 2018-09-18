package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * created by zsj in 10:11 2018/9/18
 * description:给定一个二叉树，计算整个树的坡度。
 * 一个树的节点的坡度定义即为，该节点左子树的结点之和和右子树结点之和的差的绝对值。空结点的的坡度是0。
 * 整个树的坡度就是其所有节点的坡度之和。
 **/
public class Lee563 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        root.left = node2;
        node2.left = node3;
        node3.left = node4;
        node4.left = node5;
        System.out.println(findTilt(root));
    }

    public static int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int res = 0;
        while (!queue.isEmpty()) {
            for (int i = queue.size()-1; i >= 0; i--) {
                TreeNode tmp = queue.poll();
                if (tmp.left!=null) {
                    queue.add(tmp.left);
                }
                if (tmp.right!=null) {
                    queue.add(tmp.right);
                }
                res += findOneNode(tmp);
            }
        }
        return res;
    }

    public static int findOneNode(TreeNode node) {
        if (node.right == null && node.left == null) {
            return 0;
        }
        return Math.abs(getSumOfOneNode(node.right) - getSumOfOneNode(node.left));
    }

    public static int getSumOfOneNode(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return node.val;
        }
        else if (node.left == null || node.right == null) {
            return node.val + (node.left == null ? node.right.val : node.left.val);
        }
        return getSumOfOneNode(node.left) + getSumOfOneNode(node.right) + node.val;
    }
}
