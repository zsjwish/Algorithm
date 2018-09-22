package leetcode;

/**
 * created by zsj in 21:58 2018/9/20
 * description:
 **/
public class Lee110 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node2.left = node3;
        node3.left = node4;
        node1.right = node5;
    }

    public static boolean isBalanced(TreeNode root) {
        dfs(root);
        return isBalanced;
    }

    static boolean isBalanced = true;
    public static int dfs(TreeNode root) {
        if (!isBalanced) {
            return -1;
        }
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        if (Math.abs(left - right) > 1) {
            isBalanced = false;
        }
        return Math.max(left, right) + 1;

    }
}
