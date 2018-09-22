package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * created by zsj in 11:49 2018/9/22
 * description:
 * 给定一个二叉树，编写一个函数来获取这个树的最大宽度。树的宽度是所有层中的最大宽度。这个二叉树与满二叉树（full binary tree）结构相同，但一些节点为空。
 * 每一层的宽度被定义为两个端点（该层最左和最右的非空节点，两端点间的null节点也计入长度）之间的长度。
 * 示例 1:
 * 输入:
 * 1
 * /   \
 * 3     2
 * / \     \
 * 5   3     9
 * 输出: 4
 * 解释: 最大值出现在树的第 3 层，宽度为 4 (5,3,null,9)。
 **/
public class Lee662 {
    public static void main(String[] args) {
//        TreeNode node1 = new TreeNode(3);
//        TreeNode node2 = new TreeNode(1);
//        TreeNode node3 = new TreeNode(2);
//        node1.right = node2;
//        node2.left = node3;
//        System.out.println(widthOfBinaryTree(node1));
        List<Integer> list = new LinkedList<>();
        list.add(null);
        list.add(1);
        list.add(4);
        list.add(null);
        list.add(null);
        list.remove(null);
        System.out.println(list.size());
        System.out.println(removeBorderNull(list));
    }

    public static int widthOfBinaryTree(TreeNode root) {
        int res = 0;
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new LinkedList<>();
            for (int i = queue.size()-1; i >= 0; i--) {
                TreeNode tmp = queue.poll();
                if (tmp == null) {
                    list.add(null);
                    list.add(null);
                    continue;
                }
                if (tmp.left == null) {
                    list.add(null);
                }
                else {
                    list.add(tmp.left.val);

                }
                queue.add(tmp.left);
                if (tmp.right == null) {
                    list.add(null);
                }
                else {
                    list.add(tmp.right.val);
                }
                queue.add(tmp.right);
            }
            res = Math.max(res, removeBorderNull(list).size());
        }
        return res;
    }

    public static List<Integer> removeBorderNull(List<Integer> list) {
        for (Integer tmp : list) {
            if (tmp != null) {
                break;
            }
            list.remove(null);
        }
        while (true) {
            if (list.get(list.size()-1) == null) {
                list.remove(list.size()-1);
            }
            else {
                break;
            }
        }
        return list;
    }

}
