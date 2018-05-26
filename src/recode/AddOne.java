package recode;

import java.util.Arrays;

/**
 * created by zsj in 16:13 2018/5/26
 * description:给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 **/
public class AddOne {
    public static void main(String[] args) {
        AddOne addOne = new AddOne();
        int[] digits = new int[]{5,6,2,0,0,4,6,2,4,9};
        addOne.plusOne(digits);
    }
    public int[] plusOne1(int[] digits) {
        if (digits[digits.length-1] != 9) {
            digits[digits.length - 1] += 1;
            return digits;
        }
        long num = 0;
        for (int i = 0; i < digits.length; i++) {
            num = num*10 + digits[i];
        }
        num++;
        String tmp = num+"";
        int[] res = new int[tmp.length()];
        for (int i = 0; i < tmp.length(); i++) {
            res[i] = tmp.charAt(i)-'0';
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
    public int[] plusOne(int[] digits) {
        int t = digits.length-1;
        while (digits[t]==9) {
            digits[t]=0;
            t--;
            if (t<0) {
                int[] res = new int[digits.length+1];
                res[0] = 1;
                return res;
            }
        }
        digits[t]++;
        System.out.println(Arrays.toString(digits));
        return digits;
    }
}
