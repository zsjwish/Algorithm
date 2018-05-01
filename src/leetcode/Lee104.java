package leetcode;

/**
 * created by zsj in 12:41 2018/5/1
 * description:
 **/
public class Lee104 {

    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        return depth(root, 1);
    }

    public int depth(TreeNode root, int d) {
        if (root == null) {
            return d - 1;
        }
        return Math.max(depth(root.left, d+1), depth(root.right, d+1));
    }

}
