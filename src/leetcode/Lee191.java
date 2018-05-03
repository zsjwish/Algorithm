package leetcode;

import java.util.Set;
import java.util.UUID;

/**
 * created by zsj in 15:51 2018/5/2
 * description:输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）
 **/
public class Lee191 {

    public static void main(String[] args) {
        Lee191 lee191 = new Lee191();
//        lee191.hammingWeight(-2147483648);
        System.out.println(-2 >> 1);
    }

    public int hammingWeight1(int n) {
        return Integer.bitCount(n);
    }
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        System.out.println(count);
        return count;
    }
}
