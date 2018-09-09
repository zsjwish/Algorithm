package leetcode;

/**
 * created by zsj in 0:07 2018/9/9
 * description:实现函数 ToLowerCase()，该函数接收一个字符串参数 str，
 * 并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 **/
public class Lee709 {
    public static void main(String[] args) {
        String str = "ZJSJ";
        System.out.println(toLowerCase(str));
    }

    /**
     * A-Z 65-90 a-z 97-122
     * 所以根据每一位的大小判断，如果在65-90之间则加上32
     * @param str
     * @return
     */
    public static String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]>='A'&& chars[i] <='Z') {
                chars[i] += 32;
            }
        }
        return new String(chars);
    }
}
