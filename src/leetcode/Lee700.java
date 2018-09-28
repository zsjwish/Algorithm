package leetcode;

/**
 * created by zsj in 13:31 2018/9/28
 * description:
 * 给定二叉搜索树（BST）的根节点和一个值。
 * 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
 **/
public class Lee700 {
    public static void main(String[] args) {

    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        while (root != null && root.val != val) {
            if (root.val > val) {
                root = root.left;
            }
            else {
                root = root.right;
            }
        }
        return root;
    }
}
