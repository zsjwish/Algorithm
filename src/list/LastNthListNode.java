package list;

import leetcode.ListNode;

 /**
 * created by zsj in 17:28 2018/4/25
 * description:找到单链表倒数第N个节点,使用双指针，一个先走N步，然后两个一起走到后一个到最后，则前一个就是倒数第N个节点。
 **/
public class LastNthListNode {

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
        LastNthListNode lastNthListNode = new LastNthListNode();
        lastNthListNode.lastNListNode(one, 7);
    }

    public ListNode lastNListNode(ListNode head, int n) {
        ListNode first = head;
        ListNode last = head;
        for (int i = n - 1; i > 0; i--) {
            last = last.next;
            if (last == null && n > 0) {
                System.out.println("没有这么多节点");
                return null;
            }
        }
        while (last.next != null) {
            first = first.next;
            last = last.next;
        }
        System.out.println(first.val);
        return first;
    }

}
