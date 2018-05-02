package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 14:59 2018/5/2
 * description:颠倒给定的 32 位无符号整数的二进制位。
 * 输入: 43261596
 * 输出: 964176192
 * 解释: 43261596 的二进制表示形式为 00000010100101000001111010011100 ，
 * 返回 964176192，其二进制表示形式为 00111001 01111000 00101001 01000000 。
 **/
public class Lee190 {

    public static void main(String[] args) {
        Lee190 lee190 = new Lee190();
        System.out.println(lee190.reverseBits(1));

//        System.out.println(lee190.binaryToInt("10000000000000000000000000000000"));
    }

    private int reverseBits(int n) {
        //res存放结果，flag用来保证可以循环32次。
        int res = 0;
        int flag = 1;
        while (flag!=0) {
            //res = 当前值右移一位加上n的最后一位（0或者1）
            res = (res<<1) + (n&1);
            //n右移一位，因为后一位已经转移到了res中
            n >>= 1;
            //flag左移一位，知道移到最右边溢出成为0，所以一共可以循环32次。保证非0可以被循环到。
            flag <<= 1;
        }
        System.out.println(res);
        return res;

    }

    public int reverseBits1(int n) {
        String binary = intToBinary(n);
        return binaryToInt(binary);
    }

    public String intToBinary(int n) {
        StringBuffer sb = new StringBuffer();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        int lenght = 32 - sb.length();
        while (--lenght >= 0) {
            sb.append('0');
        }
        //这里输出的是int的二进制的倒序，因为后面要用到倒序，所以就不倒正了。
        System.out.println(sb);
        return sb.toString();
    }

    public int binaryToInt(String b) {
        int res = 0;
        int length = b.length() - 1;
        for (int i = length; i >= 0 ; i--) {
            if (b.charAt(i) == '1') {
                res += Math.pow(2,length - i);
            }
        }
        System.out.println(res);
        return res;
    }

    public String reverse(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        int low = 0, high = s.length()-1;
        char[] chars = s.toCharArray();
        while (low < high) {
            char tmp = chars[low];
            chars[low] = chars[high];
            chars[high] = tmp;
            low++;
            high--;
        }
        return new String(chars);
    }

}
