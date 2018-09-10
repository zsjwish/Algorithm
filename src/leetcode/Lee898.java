package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * created by zsj in 21:06 2018/9/10
 * description:我们有一个非负整数数组 A。
 * 对于每个（连续的）子数组 B = [A[i], A[i+1], ..., A[j]] （ i <= j），我们对 B 中的每个元素进行按位或操作，获得结果 A[i] | A[i+1] | ... | A[j]。
 * 返回可能结果的数量。 （多次出现的结果在最终答案中仅计算一次。）
 **/
public class Lee898 {
    public static void main(String[] args) {
        System.out.println(subarrayBitwiseORs(new int[]{0}));
        System.out.println(subarrayBitwiseORs(new int[]{1,1,2}));
    }

    public static int subarrayBitwiseORs(int[] A) {
        Set<Integer> ans = new HashSet<>();
        Set<Integer> cur = new HashSet<>();
        for (int a : A) {
            Set<Integer> nxt = new HashSet<>();
            nxt.add(a);
            for (int b : cur)
                nxt.add(a | b);
            ans.addAll(nxt);
            cur = nxt;
        }
        return ans.size();
//        int length = A.length;
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < length; i++) {
//            Set<Integer> cur = new HashSet<>();
//            int res = A[i];
//            cur.add(res);
//            for (int j = i + 1; j < length; j++) {
//                res |= A[j];
//                cur.add(res);
//            }
//            set.addAll(cur);
//        }
//        return set.size();
    }
}
