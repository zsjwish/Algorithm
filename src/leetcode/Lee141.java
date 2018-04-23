package leetcode;

/**
 * created by zsj in 14:10 2018/4/23
 * description:判断一个单链表是否有环，思路：使用一个快指针和一个慢指针，快指针每次走两步，慢指针每次走一次。
 * 如果快指针走到最后为空的时候慢指针和快指针还没有重合，说明没有环，如果中途相遇说明有环。
 **/
public class Lee141 {

    public static void main(String[] args) {
        ListNode one = new ListNode(3);
        ListNode two = new ListNode(4);
        ListNode three = new ListNode(5);
        ListNode four = new ListNode(6);
        ListNode five = new ListNode(7);
        ListNode six = new ListNode(8);
        ListNode seven = new ListNode(9);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = three;

        Lee141 lee141 = new Lee141();
        System.out.println(lee141.hasCycle(one));

    }
    //判断单链表时候有环
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

}