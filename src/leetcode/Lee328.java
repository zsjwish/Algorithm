package leetcode;

import java.util.List;

/**
 * created by zsj in 13:20 2018/5/26
 * description:给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。
 * 请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 * 请尝试使用原地算法完成。
 * <p>
 * 你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes为节点总数。
 **/
public class Lee328 {
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
        Lee328 lee328 = new Lee328();
        lee328.oddEvenList1(one);
    }

    private ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head, even = head.next, evenhead = even;
        while (even!=null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        ListNode.printListNode(head);
        ListNode.printListNode(evenhead);
        odd.next = evenhead;
        ListNode.printListNode(head);
        return head;
    }

    /**
     * O(N)空间复杂度
     * @param head
     * @return
     */
    public ListNode oddEvenList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode oddCur = odd;
        ListNode evenCur = even;
        int flag = 1;
        while (head!=null) {
            if (flag % 2 == 1) {
                oddCur.next = head;
                oddCur = oddCur.next;
            }
            else {
                evenCur.next = head;
                evenCur = evenCur.next;
            }
            head = head.next;
            flag++;
        }
        ListNode.printListNode(odd.next);
        ListNode.printListNode(even.next);
        ListNode.printListNode(even);
        oddCur.next = null;
        evenCur.next = null;
        ListNode.printListNode(odd.next);
        ListNode.printListNode(even.next);
        oddCur.next = even.next;
        ListNode.printListNode(odd.next);
        ListNode.printListNode(even.next);
        return odd.next;
    }
}
