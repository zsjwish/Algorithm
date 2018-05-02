package leetcode;

/**
 * created by zsj in 10:46 2018/5/2
 * description:编写一个程序，找到两个单链表相交的起始节点。例如，下面的两个链表：
 *  A:       a1 → a2
 *                 ↘
 *                   c1 → c2 → c3
 *                 ↗
 *  B: b1 → b2 → b3
 *  返回c1，如果没有相交的点则返回null;
 **/
public class Lee160 {

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pa = headA;
        ListNode pb = headB;
        ListNode lasta = null;
        ListNode lastb = null;
        Boolean flagA = false;
        Boolean flagB = false;
        while (pa != pb) {
            if (pa.next == null) {
                lasta = pa;
                flagA = true;
                pa = headB;
            }
            else {
                pa = pa.next;
            }
            if (pb.next == null) {
                lastb = pb;
                flagB = true;
                pb = headA;
            }
            else {
                pb = pb.next;
            }
            if (flagA && flagB && lasta != lastb) {
                return null;
            }
        }
        System.out.println(pa.val);
        return pa;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pa = headA;
        ListNode pb = headB;
        while (pa != pb) {
            pa = pa == null ? headB : pa.next;
            pb = pb == null ? headA : pb.next;
        }
        return pa;
    }

}
