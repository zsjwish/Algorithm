package leetcode;

/**
 * created by zsj in 14:17 2018/5/4
 * description:给定一个整数，将其转化为7进制，并以字符串形式输出。
 **/
public class Lee504 {

    public static void main(String[] args) {
        Lee504 lee504 = new Lee504();
        lee504.convertToBase7(10);
        System.out.println(Integer.parseInt("141",10));
        System.out.println(Integer.toString(141,7));
    }

    public String convertToBase7(int num) {
        StringBuffer sb = new StringBuffer();
        int tmp = num;
        if (num < 0) {
            tmp = -num;
        }
        while (tmp >= 7) {
            sb.append(tmp % 7);
            tmp /= 7;
        }
        sb.append(tmp);
        sb = sb.reverse();
        if (num < 0) {
            sb.insert(0, "-");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

}
