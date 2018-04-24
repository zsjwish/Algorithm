package leetcode;

/**
 * created by zsj in 23:15 2018/4/23
 * description:回文链表，判断一个链表是否是回文链表。
 * 自己思路：每次从后面寻找没有比较过的节点和前面节点比较，不断后移直到中间为止
 * 另一种好的思路：反转部分链表，首先使用快慢指针的方式找到中间点，然后反转后面部分，最后验证两边相同。good
 **/
public class Lee234 {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(3);
        ListNode six = new ListNode(2);
        ListNode seven = new ListNode(1);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        Lee234 lee234 = new Lee234();
        lee234.isPalindrome(one);
//        lee234.isPalindrome(one);
    }
    //每次都找到最后的没判断的某个元素进行比较，耗时。
    public boolean isPalindrome1(ListNode head) {
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
    //反转部分链表，使用快慢链表
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = reverseList(slow);
        while (fast!=null && head!=null) {
            if (fast.val != head.val) {
                System.out.println("不是回文");
                return false;
            }
            fast = fast.next;
            head = head.next;
        }
        System.out.println("是回文");
        return true;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode first = null;
        ListNode second = head;
        while (second !=null) {
            ListNode tmp = second.next;
            second.next = first;
            first = second;
            second = tmp;
        }
//        printList(first);
        return first;
    }
    //打印链表
    public void printList(ListNode head) {
        while (head!=null) {
            System.out.print(head.val + "==>");
            head = head.next;
        }
        System.out.println("null");
    }

}
