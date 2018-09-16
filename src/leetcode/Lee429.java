package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * created by zsj in 22:36 2018/9/16
 * description:
 * 给定一个N叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。
 **/
public class Lee429 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node tmp;
            List<Integer> row = new LinkedList<>();
            for (int i = queue.size()-1; i >= 0; i--) {
                tmp = queue.poll();
                row.add(tmp.val);
                queue.addAll(tmp.children);
            }
            res.add(row);
        }
        return res;
    }
}
