package leetcode;

/**
 * created by zsj in 19:15 2018/5/1
 * description:给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 * 说明: 叶子节点是指没有子节点的节点。
 **/
public class Lee112 {

    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (sum == root.val && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.right, sum - root.val) || hasPathSum(root.left, sum - root.val);


    }

}
