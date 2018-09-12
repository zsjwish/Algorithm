package leetcode;

/**
 * created by zsj in 23:48 2018/9/11
 * description:给定一个整数，编写一个算法将这个数转换为十六进制数。对于负整数，我们通常使用 补码运算 方法。
 **/
public class Lee405 {
    public static void main(String[] args) {
        System.out.println(toHex(-2));
    }

    public static String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuffer sb = new StringBuffer();
        String s = "0123456789abcdef";
        while (num!=0) {
            sb.append(s.charAt(num&0xf));
            num >>>= 4;
        }
        return sb.reverse().toString();
    }

    public static String toHex1(int num) {
        num = num < 0 ? ~(-num) + 1 : num;
        System.out.println(num);
        StringBuffer sb = new StringBuffer();
        while (num > 16) {
            int tmp = num % 16;
            String s;
            switch (tmp) {
                case 10 :
                    s = "a";
                    break;
                case 11 :
                    s = "b";
                    break;
                case 12 :
                    s = "c";
                    break;
                case 13 :
                    s = "d";
                    break;
                case 14 :
                    s = "e";
                    break;
                case 15 :
                    s = "f";
                    break;
                default:
                    s = String.valueOf(tmp);
                    break;
            }
            sb.append(s);
            num /= 16;
        }
        return sb.reverse().toString();
    }
}
