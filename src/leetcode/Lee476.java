package leetcode;

/**
 * created by zsj in 20:10 2018/5/25
 * description:给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 * 注意:
 * 给定的整数保证在32位带符号整数的范围内。
 * 你可以假定二进制数不包含前导零位。
 **/
public class Lee476 {
    public static void main(String[] args) {
        Lee476 lee476 = new Lee476();
        lee476.findComplement(12);
    }

    public int findComplement(int num) {
        String s =  Integer.toBinaryString(num);
        s =  s.replace('1','(');
        s = s.replace('0',')');
        System.out.println(s);
        s =  s.replace('(','0');
        s = s.replace(')','1');
        System.out.println(s);
        int tmp = Integer.valueOf(s,2);
        System.out.println(tmp);
        return tmp;
    }
}
