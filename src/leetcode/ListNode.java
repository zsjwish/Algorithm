package leetcode;

/**
 * created by zsj in 15:05 2018/4/23
 * description: 单链表
 **/
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
        next = null;
    }
    public static void printListNode(ListNode first) {
        while (first != null) {
            System.out.print(first.val + "==>");
            first = first.next;
        }
        System.out.println("null");
    }
}
