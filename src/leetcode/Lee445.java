package leetcode;

/**
 * created by zsj in 13:30 2018/9/27
 * description:
 * 给定两个非空链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储单个数字。将这两数相加会返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 **/
public class Lee445 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        ListNode s1 = new ListNode(5);
        ListNode s2 = new ListNode(6);
        ListNode s3 = new ListNode(4);
        s1.next = s2;
        s2.next = s3;
        addTwoNumbers(l1, s1);
    }

    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();
        while (l1 != null) {
            s1.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.append(l2.val);
            l2 = l2.next;
        }
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        long a1 = Long.valueOf(s1.toString());
        long a2 = Long.valueOf(s2.toString());
        String s3 = String.valueOf(3999999999L+a2);
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        for (char c : s3.toCharArray()) {
            ListNode tmp = new ListNode(Integer.valueOf(c - '0'));
            cur.next = tmp;
            cur = cur.next;
        }
        return head.next;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        return null;
    }
}
