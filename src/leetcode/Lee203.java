package leetcode;


/**
 * created by zsj in 14:15 2018/4/26
 * description:
 **/
public class Lee203 {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(1);
        ListNode three = new ListNode(6);
        ListNode four = new ListNode(3);
        ListNode five = new ListNode(4);
        ListNode six = new ListNode(5);
        ListNode seven = new ListNode(6);
        one.next = two;
//        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        Lee203 lee203 = new Lee203();
        lee203.removeElements(one, 1);
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode last = first;
        while (last != null && last.next!=null) {
            if (last.next.val == val) {
                last.next = last.next.next;
            }
            else {
                last = last.next;
            }
        }
        ListNode.printListNode(first.next);
        return first.next;
    }
}
