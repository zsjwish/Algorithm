package leetcode;

/**
 * created by zsj in 14:50 2018/4/22
 * description:字符串反转II,给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。
 * 如果剩余少于 k 个字符，则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。
 * 思路:先写一个能反转部分字符串的函数（这个容易），然后在reverseStr中i每次加k,然后设置一个flag可以用来判断是奇数还是偶数次，
 * 奇数次反转，偶数次不变，最重要的是：在最后一步，要判断是否还有K个，即判断时候是最后一次反转，如果是，就是从i到length-1的反转，
 * 而不是i-i+k（这样会溢出）
 **/
public class Lee541 {
    public static void main(String[] args) {
        Lee541 lee541 = new Lee541();
        String s = "012345678941";
        lee541.reverseStr(s,4);
    }


    public String reverseStr(String s, int k) {
        if (s == null || s.length() == 0) {
            return s;
        }
        int length = s.length();
        int flag = 0;
        int i = 0;
        while (i < length) {
            if (flag % 2 == 0) {
                //判断时候是最后一步
                if (i+k > length) {
                    s = reverse(s, i,length-1);
                }
                else {
                    s = reverse(s, i, i + k - 1);
                }
            }
            flag++;
            i += k;
        }
        System.out.println(s);
        return s;
    }
    public String reverse(String s, int start, int end) {
        if (end < start) {
            return s;
        }
        char[] chars = s.toCharArray();
        while (start < end) {
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start++;
            end--;
        }
        s = new String(chars);
        return s;
    }
}
