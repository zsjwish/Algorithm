package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * created by zsj in 16:53 2018/9/28
 * description:填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 * 初始状态下，所有 next 指针都被设置为 NULL。
 **/
class TreeLinkNode {
    int val;
    TreeLinkNode left, right, next;
    TreeLinkNode(int x) { val = x; }
}

public class Lee117 {
    public static void main(String[] args) {
        TreeLinkNode node1 = new TreeLinkNode(1);
        TreeLinkNode node2 = new TreeLinkNode(2);
        TreeLinkNode node3 = new TreeLinkNode(3);
        TreeLinkNode node4 = new TreeLinkNode(4);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        connect(node1);
    }

    public static void connect(TreeLinkNode root) {
        LinkedList<TreeLinkNode> list = new LinkedList<>();
        if (root == null) {
            return;
        }
        list.add(root);
        root.next = null;
        while (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                list.get(i).next = list.get(i-1);
            }
            list.get(0).next = null;
            for (int i = list.size() - 1; i >= 0; i--) {
                TreeLinkNode tmp = list.pollLast();
                if (tmp.left != null) {
                    list.addFirst(tmp.left);
                }
                if (tmp.right != null) {
                    list.addFirst(tmp.right);
                }
            }
        }
    }
}
