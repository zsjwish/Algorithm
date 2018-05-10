package interview;

import leetcode.ListNode;

/**
 * created by zsj in 13:44 2018/5/10
 * description: 删除链表中的奇数个节点
 **/
public class YuanFuDaoOne {

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        ListNode seven = new ListNode(7);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        YuanFuDaoOne yfd = new YuanFuDaoOne();
        yfd.deleteOddNode(one);
    }

    public ListNode deleteOddNode(ListNode head) {
        ListNode first = new ListNode(0);
        ListNode cur = first;
        ListNode last = head;
        int flag = 1;
        while (last != null) {
            if (flag % 2 == 1) {
                cur.next = last.next;
                cur = cur.next;
            }
            last = last.next;
            flag++;
        }
        ListNode.printListNode(first.next);
        return first.next;
    }

}
