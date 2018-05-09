package list;

import leetcode.ListNode;

/**
 * created by zsj in 15:01 2018/5/9
 * description:反转链表
 **/
public class RevertList {

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
        ListNode.printListNode(one);
        RevertList revertList = new RevertList();
        ListNode.printListNode(revertList.revertList(one));

    }
    public ListNode revertList(ListNode head) {
        ListNode first = null;
        ListNode second = head;
        while (second!=null) {
            ListNode tmp = second.next;
            second.next = first;
            first = second;
            second = tmp;
        }
        return first;
    }

}
