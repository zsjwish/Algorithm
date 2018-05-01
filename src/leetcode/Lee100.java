package leetcode;

/**
 * created by zsj in 11:31 2018/5/1
 * description:给定两个二叉树，编写一个函数来检验它们是否相同。
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 **/
public class Lee100 {

    public static void main(String[] args) {

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return true;
        }
        if (p == null && q!= null || q == null && q != null || q.val != p.val) {
            return false;
        }
        return isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
    }
}
