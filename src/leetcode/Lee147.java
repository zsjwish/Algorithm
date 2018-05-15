package leetcode;

/**
 * created by zsj in 14:21 2018/5/15
 * description:对链表进行插入排序
 * 限制：O(1) 的空间，也就是说在原来链表的基础上完成排序
 * 思路：
 **/
public class Lee147 {

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(7);
        ListNode three = new ListNode(5);
        ListNode four = new ListNode(2);
        ListNode five = new ListNode(3);
        ListNode six = new ListNode(6);
        ListNode seven = new ListNode(4);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        Lee147 lee147 = new Lee147();
        lee147.insertionSortList(one);
    }

    public ListNode insertionSortList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode helper = new ListNode(0); //new starter of the sorted list
        ListNode cur = head; //the node will be inserted
        ListNode pre = helper; //insert node between pre and pre.next
        ListNode next = null; //the next node will be inserted
        //not the end of input list
        while( cur != null ){
            next = cur.next;
            //find the right place to insert
            while( pre.next != null && pre.next.val < cur.val ){
                pre = pre.next;
            }
            //insert between pre and pre.next
            cur.next = pre.next;
            pre.next = cur;
            pre = helper;
            cur = next;
        }
        ListNode.printListNode(helper.next);
        return helper.next;
    }

    public ListNode insertionSortList(ListNode head) {
        ListNode helper = new ListNode(0);
        ListNode cur = head;
        ListNode pre = helper;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            while (pre.next != null && pre.next.val < cur.val) {
                pre = pre.next;
            }
            cur.next = pre.next;
            pre.next = cur;
            cur = next;
            pre = helper;
        }
        ListNode.printListNode(helper.next);
        return helper.next;
    }
}
