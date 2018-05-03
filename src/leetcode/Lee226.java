package leetcode;

/**
 * created by zsj in 9:45 2018/5/3
 * description:翻转一棵二叉树。
 **/
public class Lee226 {

    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return root;
        }
        root.right = invertTree(root.right);
        root.left = invertTree(root.left);
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        return root;
    }

}
