package recode;

/**
 * created by zsj in 18:51 2018/5/26
 * description:给定一个 32 位有符号整数，将整数中的数字进行反转
 **/
public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        reverseInteger.reverse(123);
    }
    public int reverse(int x) {
        if (x > -9 && x < 9) {
            return x;
        }
        StringBuilder sb = new StringBuilder();
        String flag = "";
        if (x < 0) {
            flag = "-";
            x = -x;
        }

        String tmp = x+"";
        for (int i = tmp.length()-1; i >= 0; i--) {
            sb.append(tmp.charAt(i));
        }
        while (sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        System.out.println(flag+sb.toString());
        if (sb.toString().length() >= (Integer.MAX_VALUE+"").length() && sb.toString().compareTo(Integer.MAX_VALUE+"")>0) {
            return 0;
        }
        return Integer.valueOf(flag+sb.toString());
    }
}
