package leetcode;

/**
 * created by zsj in 11:34 2018/5/2
 * description:给定一个正整数，返回它在Excel表中相对应的列名称。
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * ...
 **/
public class Lee168 {

    public static void main(String[] args) {
        Lee168 lee168 = new Lee168();
        lee168.convertToTitle(52);
    }

    public String convertToTitle(int n) {
        StringBuffer sb = new StringBuffer();
        while (n > 26) {
           sb.append((char)('A' + (n-1) % 26));
           n = (n-1) / 26;
        }
            sb.append((char) ('A' + n - 1));

        System.out.println(sb.reverse());
        return new String(sb.reverse());
    }

}
