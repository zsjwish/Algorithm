package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * created by zsj in 12:25 2019/8/17
 * description:给定由若干 0 和 1 组成的数组 A。我们定义 N_i：从 A[0] 到 A[i] 的第 i 个子数组被解释为一个二进制数（从最高有效位到最低有效位）。

 返回布尔值列表 answer，只有当 N_i 可以被 5 整除时，答案 answer[i] 为 true，否则为 false。
 **/
public class Lee1018 {
    public static List<Boolean> prefixesDivBy5(int[] A) {
        int length = A.length;
        List<Boolean> res = new ArrayList<>(length);
        int number = 0;
        for (int i = 0; i < length; i++) {
            number <<= 1;
            number += A[i];
            number %= 10;
            res.add(number % 5 == 0);
        }
        System.out.println(res.toString());
        return res;
    }

    public static void main(String[] args) {
        prefixesDivBy5(new int[]{0,1,1});
        prefixesDivBy5(new int[]{1,1,1});
        prefixesDivBy5(new int[]{0,1,1,1,1,1});
        prefixesDivBy5(new int[]{1,1,1,0,1});
    }

}
