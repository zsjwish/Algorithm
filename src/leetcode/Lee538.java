package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * created by zsj in 20:06 2018/10/1
 * description:给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，
 * 使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
 * 思路：递归，因为比它大的在左边，小的在右边，
 **/
public class Lee538 {
    public static void main(String[] args) {
//        TreeNode node1 = new TreeNode(1);
//        TreeNode node2 = new TreeNode(2);
//        TreeNode node3 = new TreeNode(3);
//        TreeNode node4 = new TreeNode(4);
//        TreeNode node5 = new TreeNode(5);
//        TreeNode node6 = new TreeNode(6);
//        node1.right = node2;
//        node1.left = node3;
//        node2.left = node4;
//        node3.right = node5;
//        node5.left = node6;
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(1);
        node1.left = node2;
        convertBST(node1);
    }

    public static TreeNode convertBST(TreeNode root) {
        if (root == null || root.right == null && root.left == null) {
            return root;
        }
        preorder(root);
        List<TreeNode> list = res;
        for (TreeNode t : list) {
            System.out.printf(t.val + "  ");
        }
        int sum = list.get(list.size() - 1).val;
        for (int i = list.size() - 2; i >= 0; i--) {
            int val = list.get(i).val;
            list.get(i).val += sum;
            sum += val;
        }
        System.out.println();
        for (TreeNode t : list) {
            System.out.printf(t.val + "  ");
        }
        return root;
    }

    static List<TreeNode> res = new LinkedList<>();
    public static void preorder(TreeNode root) {
        if (root != null) {
            preorder(root.left);
            res.add(root);
            preorder(root.right);
        }
    }
}
