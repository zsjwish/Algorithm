package leetcode;

/**
 * created by zsj in 10:38 2018/4/24
 * description:给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 思路：排除不是数字和字母的字符，然后判断是否是回文串。超时
 * 另一种思路：双指针，不用排除不是数字和字母的字符，只要跳过他们就可以了。肯定节省时间
 **/
public class Lee125 {

    public static void main(String[] args) {
        Lee125 lee125 = new Lee125();
        String s = "123,.;-=we-+e+w3-2/1=";
        lee125.isPalindrome("s");
    }

    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        s = s.toLowerCase();
        int low = 0, high = s.length() - 1;
        while (low < high) {

            while (low < high && !Character.isDigit(s.charAt(low)) && !Character.isLetter(s.charAt(low))) {
                low++;
            }
            while (low < high && !Character.isDigit(s.charAt(high)) && !Character.isLetter(s.charAt(high))) {
                high--;
            }
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    //通过去掉不是数字和字母的字符然后判断回文，超时
    public boolean isPalindrome1(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        s = strOnlyLetterAndNumber(s);
        int low = 0, high = s.length()-1;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                System.out.println("false");
                return false;
            }
            low++;
            high--;
        }
        System.out.println("true");
        return true;
    }

    public String strOnlyLetterAndNumber(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        String res = "";
        int length = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i < length; i++) {
            if (Character.isLetter(chars[i]) || Character.isDigit(chars[i])) {
                res += chars[i];
            }
        }
        System.out.println(res);
        res = res.toLowerCase();
        return res;
    }
}
