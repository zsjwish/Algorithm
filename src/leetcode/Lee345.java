package leetcode;

/**
 * created by zsj in 10:26 2018/4/23
 * description:编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 **/
public class Lee345 {

    public static void main(String[] args) {
        Lee345 lee345 = new Lee345();
        lee345.reverseVowels("hello");
    }

    public String reverseVowels(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        int low = 0, high = s.length() - 1;
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        while (low < high) {
            while (low < high && !vowels.contains(s.charAt(low)+"")) {
                low++;
            }
            while (low < high && !vowels.contains(s.charAt(high)+"")) {
                high--;
            }
            char tmp = chars[low];
            chars[low] = chars[high];
            chars[high] = tmp;
            low++;
            high--;
        }
        s = new String(chars);
        System.out.println(s);
        return s;
    }
}
