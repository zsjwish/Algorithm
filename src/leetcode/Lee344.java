package leetcode;

/**
 * created by zsj in 13:56 2018/4/22
 * description:给定一个字符串，输出它的逆序。
 **/
public class Lee344 {

    public static void main(String[] args) {
        Lee344 lee344 = new Lee344();
        lee344.reverseString("hello");
    }

    public String reverseString(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        int length = s.length();
        char[] res = s.toCharArray();
        int low = 0, high = length-1;
        while (low < high) {
            char tmp = res[low];
            res[low] = res[high];
            res[high] = tmp;
            low++;
            high--;
        }
        System.out.println(new String(res));
        return new String(res);
    }

}
