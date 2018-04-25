package list;

import leetcode.ListNode;

/**
 * created by zsj in 18:36 2018/4/25
 * description:删除单链表倒数第N个节点
 **/
public class DeleteLastNthListNode {

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
        DeleteLastNthListNode deleteLastNthListNode = new DeleteLastNthListNode();

        deleteLastNthListNode.getLastNthListNode(one, 7);
        deleteLastNthListNode.deleteLastNthListNode(one, 4);

    }

    LastNthListNode lastNthListNode;
    public ListNode deleteLastNthListNode(ListNode head, int n) {
        lastNthListNode = new LastNthListNode();
        ListNode delete = lastNthListNode.lastNListNode(head, n+1);
        delete.next = delete.next.next;
        ListNode.printListNode(head);
        return head;
    }

    public ListNode getLastNthListNode(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode first = head;
        ListNode last = head;
        for (int i = 0; i < n - 1; i++) {
            last = last.next;
            if (last == null) {
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
