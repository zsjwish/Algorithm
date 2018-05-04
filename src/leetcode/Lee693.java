package leetcode;

/**
 * created by zsj in 11:07 2018/5/4
 * description: 给定一个正整数，检查他是否为交替位二进制数：换句话说，就是他的二进制数相邻的两个位数永不相等。
 **/
public class Lee693 {

    public static void main(String[] args) {
        Lee693 lee693 = new Lee693();
        System.out.println(lee693.intToBinary(127));
    }

    public boolean hasAlternatingBits(int n) {
        String tmp = intToBinary(n);
        for (int i = 0; i < tmp.length() - 1; i++) {
            if (tmp.charAt(i) == tmp.charAt(1+i)) {
                return false;
            }
        }
        return true;
    }

    public String intToBinary(int n) {
        StringBuffer sb = new StringBuffer();
        while (n > 0) {
            if ((n&1) == 1) {
                sb.append("1");
            }
            else sb.append("0");
            n >>= 1;
        }
        return sb.reverse().toString();
    }

}
