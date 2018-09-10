package leetcode;

import java.lang.reflect.Array;
import java.util.*;

/**
 * created by zsj in 20:59 2018/9/10
 * description:给定两个整数 L 和 R ，找到闭区间 [L, R] 范围内，计算置位位数为质数的整数个数。
 * 注意，计算置位代表二进制表示中1的个数。例如 21 的二进制表示 10101 有 3 个计算置位。还有，1 不是质数。
 **/
public class Lee762 {
    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(6,10));
        System.out.println(countPrimeSetBits(10,15));
    }

    public static int countPrimeSetBits(int L, int R) {
        List<Integer> arrayList = Arrays.asList(2,3,5,7,11,13,17,19,23,29,31,37);
        int res = 0;
        for (int i = L; i <= R; i++) {
            if (arrayList.contains(Integer.bitCount(i))) {
                res++;
            }
        }
        return res;
    }
}
