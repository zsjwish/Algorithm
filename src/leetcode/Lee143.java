package leetcode;

/**
 * created by zsj in 14:54 2018/5/9
 * description:给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
 * 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 **/
public class Lee143 {

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
        Lee143 lee143 = new Lee143();
        lee143.reorderList(one);
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode quick = head;
        ListNode slow = head;
        while (slow.next != null && slow.next.next != null) {
            quick = quick.next;
            slow = slow.next.next;
        }
        slow = null;
        while (quick != null) {
            ListNode tmp = quick.next;
            quick.next = slow;
            slow = quick;
            quick = tmp;
        }
        ListNode res = new ListNode(0);
        ListNode res1 = res;
        while (head !=null || slow.next != null) {
            if (head != null) {
                res.next = new ListNode(head.val);
                res = res.next;
                head = head.next;
            }
            if (slow.next!=null) {
                res.next = new ListNode(slow.val);
                res = res.next;
                slow = slow.next;
            }
        }
        head = res1.next;
        ListNode.printListNode(head);
        return;
    }
}
