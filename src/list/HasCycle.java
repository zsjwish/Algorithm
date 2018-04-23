package list;

import leetcode.ListNode;

/**
 * created by zsj in 15:11 2018/4/23
 * description:判断单链表是否有环，环的大小，环的起始点。
 **/
public class HasCycle {

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
        seven.next = two;
        HasCycle hasCycle = new HasCycle();
        hasCycle.hasCycle(one);
    }

    public void hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            System.out.println("没有环");
            return ;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                System.out.println("有环");
                cycleStart(head, fast, slow);
                cycleLength(head, fast);
                return;
            }
        }
        System.out.println("没有环");
    }

    private ListNode cycleStart(ListNode head, ListNode fast, ListNode slow) {
         slow = head;
         while (fast != slow) {
             slow = slow.next;
             fast = fast.next;
         }
        System.out.println("环起点是" + fast.val);
        return fast;
    }

    private int cycleLength(ListNode head, ListNode start) {
        ListNode tmp = start;
        start = start.next;
        int length = 1;
        while (start != tmp) {
            start = start.next;
            length++;
        }
        System.out.println("环长度为" + length);
        return length;
    }

}
