package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * created by zsj in 17:54 2018/9/28
 * description:
 **/
public class Lee199 {
    public static void main(String[] args) {

    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root == null) {
            return list;
        }
        list.add(root.val);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (root != null) {
            for (int i = queue.size()-1; i >= 0; i--) {
                TreeNode tmp = queue.poll();
                if (i == 0) {
                    list.add(tmp.val);
                }
                if (tmp.left != null) {
                    queue.add(tmp.left);
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
            }
        }
        return list;
    }
}
