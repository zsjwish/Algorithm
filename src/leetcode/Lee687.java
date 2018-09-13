package leetcode;

/**
 * created by zsj in 15:12 2018/9/13
 * description:给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
 * 注意：两个节点之间的路径长度由它们之间的边数表示。
 * 示例 1:
 * 输入:
 * 5
 * / \
 * 4   5
 * / \   \
 * 1   1   5
 * 输出:
 * 2
 **/
public class Lee687 {

    public static int res = 0;
    public static void main(String[] args) {

    }
    public static int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return res;
    }

    /**
     * 计算某个节点往下最大相同路径长度
     * 同时计算经过该节点的最大相同路径长度
     * @param node
     * @return
     */
    public static int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        /**
         * 深度都是指路径，不是节点数量
         * right:右子树最大相同值深度数量
         * left :左子树最大相同值深度数量
         * rightCount:包括node节点和右子树最大相同深度
         * leftCount :包括node节点和左子树最大相同深度
         */
        int right = dfs(node.right);
        int left = dfs(node.left);
        int rightCount = 0;
        int leftCount = 0;
        if (node.right != null && node.val == node.right.val) {
            rightCount = right + 1;
        }
        if (node.left != null && node.val == node.left.val) {
            leftCount = left + 1;
        }
        res = Math.max(res, rightCount + leftCount);
        return Math.max(rightCount, leftCount);
    }
}
