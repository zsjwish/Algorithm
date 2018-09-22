package leetcode;

import com.sun.org.apache.regexp.internal.RE;

import java.util.LinkedList;
import java.util.Queue;

/**
 * created by zsj in 10:56 2018/9/22
 * description:给定一个二叉树，找出其最小深度。
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * 说明: 叶子节点是指没有子节点的节点。
 * 示例:
 * 给定二叉树 [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回它的最小深度  2.
 **/
public class Lee111 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(null);
        queue.add(null);
        queue.add(null);
        System.out.println(queue.size());
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.right == null && root.left == null) {
            return 1;
        }
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
