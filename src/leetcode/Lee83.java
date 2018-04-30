package leetcode;

/**
 * created by zsj in 21:39 2018/4/30
 * description:给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * 思路：因为链表是排序的，只要两个指针，一前一后，判断两个是否相等，是的话删除后面这个元素。
 * 不是两个都后移一位，知道后一个指针到末尾。
 **/
public class Lee83 {

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(1);
        ListNode three = new ListNode(2);
        ListNode four = new ListNode(3);
        ListNode five = new ListNode(3);
        ListNode six = new ListNode(6);
        ListNode seven = new ListNode(7);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
//        five.next = six;
        six.next = seven;
        Lee83 lee83 = new Lee83();
        lee83.deleteDuplicates(one);
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode first = head, last = head.next;
        while (last != null) {
            if (last.val == first.val) {
                if (last.next == null) {
                    first.next = null;
                    last = last.next;
                }
                else {
                    first.next = last.next;
                    last = first.next;
                }
            }
            else {
                first = first.next;
                last = last.next;
            }
        }
        ListNode.printListNode(head);
        return head;
    }
}
