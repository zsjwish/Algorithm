package leetcode;

/**
 * created by zsj in 11:13 2018/9/13
 * description:给定一棵二叉树，你需要计算它的直径长度。
 * 一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
 **/
public class Lee543 {

    static int max = 0;

    public static void main(String[] args) {

    }

    public static int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return max;
    }

    /**
     * 计算某节点最大深度，在计算的时候算出从该节点经过的最大直径长度
     * @param node
     * @return
     */
    public static int helper(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int right = helper(node.right);
        int left = helper(node.left);

        max = Math.max(max, right + left);

        return Math.max(right, left) +1;
    }
}
