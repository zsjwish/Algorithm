package list;

import leetcode.ListNode;

/**
 * created by zsj in 15:30 2018/5/14
 * description:深度复制单链表
 **/
public class DeepCopyList {

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
        DeepCopyList deepCopyList = new DeepCopyList();
        ListNode copy = deepCopyList.deepCopyList(one);
        copy.next = new ListNode(100);
        ListNode.printListNode(copy);
        ListNode.printListNode(one);

    }

    public ListNode deepCopyList(ListNode head) {
        ListNode cur = head;
        ListNode copy = new ListNode(-1);
        ListNode copyCur = copy;
        while (cur != null) {
            ListNode tmp = new ListNode(cur.val);
            copyCur.next = tmp;
            copyCur = copyCur.next;
            cur = cur.next;
        }
        ListNode.printListNode(copy.next);
        ListNode.printListNode(head);
        return copy.next;
    }

}
