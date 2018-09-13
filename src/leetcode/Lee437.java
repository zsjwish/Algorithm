package leetcode;

/**
 * created by zsj in 15:49 2018/9/13
 * description:给定一个二叉树，它的每个结点都存放着一个整数值。
 * 找出路径和等于给定数值的路径总数。
 * 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 * 二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。
 **/
public class Lee437 {
    public static void main(String[] args) {

    }

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        /**
         * findPath(root, sum) 是包含root节点的解法个数
         * pathSum(root.left, sum) + pathSum(root.right, sum) 是不包含root节点的解法个数
         */
        return findPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public int findPath(TreeNode root, int sum) {
        int res = 0;
        if (root == null) {
            return res;
        }
        if (sum == root.val) {
            res ++;
        }
        res += findPath(root.left, sum - root.val);
        res += findPath(root.right, sum - root.val);
        return res;
    }
}
