package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * created by zsj in 22:25 2018/9/11
 * description:给定一个N叉树，找到其最大深度。
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 **/
public class Lee559 {
    public static void main(String[] args) {

    }

    /**
     * 广度优先搜索
     * @param root
     * @return
     */
    public int maxDepth(Node root) {
        int depth = 0;
        if (root == null) {
            return depth;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int size;
        while ((size = queue.size()) != 0) {
            depth++;
            for (int i = 0; i < size; i++) {
                List<Node> child = queue.poll().children;
                for (Node node : child) {
                    queue.add(node);
                }
            }
        }
        return depth;
    }
}
