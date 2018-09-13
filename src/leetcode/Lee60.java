package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * created by zsj in 9:45 2018/9/13
 * description:给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。
 * 按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * 给定 n 和 k，返回第 k 个排列。
 * 说明：
 * 给定 n 的范围是 [1, 9]。
 * 给定 k 的范围是[1,  n!]。
 **/
public class Lee60 {
    public static void main(String[] args) {
        getPermutation(3, 3);
        getPermutation(4, 9);
    }

    public static String getPermutation(int n, int k) {
        StringBuffer sb = new StringBuffer();
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        System.out.println(list);
        for (int i = n - 1; i >= 1; i--) {
            int index = 0;
            int tmp = list.get(0);
            int factor = factorial(i);
            while (k > factor) {
                k -= factor;
                tmp = list.get(index++);
            }
            sb.append(list.get(index));
            list.remove(index);
        }
        sb.append(list.get(0));
        System.out.println(sb.toString());
        return sb.toString();
    }

        public static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            int res = 1;
            for (int i = 2; i <= n; i++) {
                res *= i;
            }
            return res;
        }
}
