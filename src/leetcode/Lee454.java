package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * created by zsj in 12:19 2018/9/27
 * description:
 **/
public class Lee454 {
    public static void main(String[] args) {

    }

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                int sum = a + b;
                if (map.containsKey(sum)) {
                    map.put(sum, map.get(sum ) + 1);
                }
                else {
                    map.put(sum, 1);
                }
            }
        }
        for (int c : C) {
            for (int d : D) {
                int sum1 = c + d;
                if (map.containsKey(-sum1)) {
                    count += map.get(-sum1);
                }
            }
        }
        return count;
    }
}
