package leetcode;

import java.util.HashMap;

/**
 * created by zsj in 14:42 2018/5/14
 * description:
 * 给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。
 * 要求返回这个链表的深度拷贝。
 **/
public class Lee138 {

    public static void main(String[] args) {
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        RandomListNode node4 = new RandomListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node1.random = node4;
        node2.random = node3;
        node3.random = node1;
        node4.random = node2;
        Lee138 lee138 = new Lee138();
        lee138.copyRandomList(node1);
    }

    private RandomListNode copyRandomList(RandomListNode head) {
        HashMap<RandomListNode, RandomListNode> randomMap = new HashMap<>();
        RandomListNode headFake = new RandomListNode(-1);
        RandomListNode cur = headFake;
        RandomListNode pre = head;
        while (pre != null) {
            randomMap.put(pre, pre.random);
            RandomListNode tmp = new RandomListNode(head.label);
            cur.next = tmp;
            pre = pre.next;
            cur = cur.next;
        }

        return null;
    }

    public RandomListNode copyRandomList1(RandomListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        RandomListNode res = new RandomListNode(0);
        RandomListNode cur = res;
        RandomListNode headCopy = head;
        while (headCopy!=null) {
            RandomListNode tmp = new RandomListNode(headCopy.label);
            cur.next = tmp;
            tmp.random = null;
            headCopy = headCopy.next;
            cur = cur.next;
        }
        headCopy = head;
        cur = res.next;
        while (headCopy != null) {
            RandomListNode tmp = new RandomListNode(headCopy.random.label);
            cur.random =  tmp;
            cur = cur.next;
            headCopy = headCopy.next;
        }
        System.out.println(res.next);
        return res.next;

    }

}

class RandomListNode {
    int label;
    RandomListNode next, random;

    RandomListNode(int x) {
        this.label = x;
    }
};