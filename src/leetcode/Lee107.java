package leetcode;

import java.sql.Connection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * created by zsj in 16:36 2018/5/1
 * description:给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 **/
public class Lee107 {

    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        one.left = two;
        one.right = three;
        three.left = four;
        three.right = five;
        four.left = six;
        six.left = seven;

        Lee107 lee107 = new Lee107();
        lee107.levelOrderBottom(one);
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        LinkedList<TreeNode> tmpNode = new LinkedList<>();
        tmpNode.add(root);
        while (!tmpNode.isEmpty()) {
            int size = tmpNode.size();
            List<Integer> tmpList = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = tmpNode.getFirst();
                tmpNode.removeFirst();
                tmpList.add(curr.val);
                if (curr.left!=null) {
                    tmpNode.add(curr.left);
                }
                if (curr.right != null) {
                    tmpNode.add(curr.right);
                }
            }
            res.add(tmpList);
        }
        System.out.println(res);
        Collections.reverse(res);
        return res;
    }
}
