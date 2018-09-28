package leetcode;

/**
 * created by zsj in 13:16 2018/9/28
 * description:给定二叉搜索树（BST）的根节点和要插入树中的值，将值插入二叉搜索树。 返回插入后二叉搜索树的根节点。 保证原始二叉搜索树中不存在新值。
 * 注意，可能存在多种有效的插入方式，只要树在插入后仍保持为二叉搜索树即可。 你可以返回任意有效的结果。
 **/
public class Lee701 {
    public static void main(String[] args) {

    }

    public static TreeNode insertIntoBST1(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.left == null && root.val > val) {
            root.left = new TreeNode(val);
        }
        else if (root.right == null && root.val < val) {
            root.right = new TreeNode(val);
        }
        else {
            if (root.val > val) {
                insertIntoBST1(root.left, val);
            }
            else {
                insertIntoBST1(root.right, val);
            }
        }
        return root;
    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode tmp = root;
        while (tmp != null) {
            if (tmp.val < val) {
                if (tmp.right == null) {
                    tmp.right = new TreeNode(val);
                }
                tmp = tmp.right;
            }
            else {
                if (tmp.left == null) {
                    tmp.left = new TreeNode(val);
                }
                tmp = tmp.left;
            }
        }
        return root;
    }
}
