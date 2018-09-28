package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * created by zsj in 11:18 2018/9/28
 * description:给定一个二叉树，在树的最后一行找到最左边的值。
 * 思路：层次遍历，然后找出最后一个组的第一个元素
 **/
public class Lee513 {
    public static void main(String[] args) {

    }

    public static int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return -1;
        }
        if (root.left == null && root.right == null) {
            return root.val;
        }
        queue.add(root);
        TreeNode last = root;
        while (!queue.isEmpty()) {
            last = queue.peek();
            for (int i = queue.size() - 1; i >= 0; i--) {
                TreeNode tmp = queue.poll();

                if (tmp.left != null) {
                    queue.add(tmp.left);
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
            }
        }
        return last.val;
    }
}
