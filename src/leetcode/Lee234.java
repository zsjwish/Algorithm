package leetcode;

/**
 * created by zsj in 23:15 2018/4/23
 * description:回文链表，判断一个链表是否是回文链表
 **/
public class Lee234 {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(2);
        ListNode four = new ListNode(1);
        ListNode five = new ListNode(2);
        ListNode six = new ListNode(1);
        ListNode seven = new ListNode(1);

        one.next = two;
        two.next = three;
        three.next = four;
//        four.next = five;
        five.next = six;
//        six.next = seven;
        Lee234 lee234 = new Lee234();
        lee234.isPalindrome(one);
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode first = head;
        ListNode mid = first;
        ListNode last = first;
        int length = 0;
        while (last.next != null) {
            last = last.next;
            length++;
        }
        for (int i = 0; i <= length / 2; i++) {
            while (mid.next != last) {
                mid = mid.next;
            }
            if (first.val != last.val) {
                System.out.println("不是回文");
                return false;
            }
            first = first.next;
            last = mid;
            mid = first;
        }
        System.out.println("是回文");
        return true;
    }
}
