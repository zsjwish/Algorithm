package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * created by zsj in 10:29 2018/9/22
 * description:给定一个非空二叉树, 返回一个由每层节点平均值组成的数组.
 * 示例 1:
 * 输入:
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 输出: [3, 14.5, 11]
 * 解释:
 * 第0层的平均值是 3,  第1层是 14.5, 第2层是 11. 因此返回 [3, 14.5, 11].
 **/
public class Lee637 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(null);
        list.add(1);
        list.add(4);
        list.add(null);
        list.add(null);
        list.remove(null);
        System.out.println(list.size());
        System.out.println(list);
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            long sum = 0;
            int size = queue.size();
            for (int i = size-1; i >= 0; i--) {
                TreeNode tmp = queue.poll();
                sum += tmp.val;
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
                if (tmp.left != null) {
                    queue.add(tmp.left);
                }
            }
            res.add((double) sum / size);
        }
        return res;
    }
}
