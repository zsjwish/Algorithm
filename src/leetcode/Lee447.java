package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * created by zsj in 10:43 2018/5/7
 * description:给定平面上 n 对不同的点，“回旋镖” 是由点表示的元组 (i, j, k) ，其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺序）。
 * 找到所有回旋镖的数量。你可以假设 n 最大为 500，所有点的坐标在闭区间 [-10000, 10000] 中。
 **/
public class Lee447 {

    public static void main(String[] args) {
        Lee447 lee447 = new Lee447();
        int[][] nums = new int[][] {{0,0},{1,0},{2,0}};
        lee447.numberOfBoomerangs(nums);
    }

    public int numberOfBoomerangs(int[][] points) {
        if (points == null || points.length <= 2) {
            return 0;
        }
        int res = 0;
        int length = points.length;
        for (int i = 0; i < length; i++) {
            Map<Integer, Integer> map = new LinkedHashMap<>();
            for (int j = 0; j < length; j++) {
                if (j == i) {
                    continue;
                }
                int lentmp = getLen(points, i, j);
                if (map.containsKey(lentmp)) {
                    map.put(lentmp, map.get(lentmp) + 1);
                }
                else {
                    map.put(lentmp, 1);
                }
            }
            for (int value : map.values()) {
                if (value >= 2) {
                    res += value * (value - 1);
                }

            }
        }
        System.out.println(res);
        return res;
    }

    public int getJC(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * getJC(n-1);
    }

    public int numberOfBoomerangs1(int[][] points) {
        if (points == null || points.length <= 2) {
            return 0;
        }
        int res = 0;
        int length = points.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == i) {
                    continue;
                }
                double l1 = getLen(points, i, j);
                for (int k = 0; k < length; k++) {
                    if (k == j || k == i) {
                        continue;
                    }
                    if (getLen(points, i, k) == l1) {
                        res++;
                    }
                }
            }
        }
        System.out.println(res);
        return res;
    }

    public int getLen(int[][] a, int rowa, int rowb) {

        int lenx = a[rowa][0] - a[rowb][0];
        int leny = a[rowa][1] - a[rowb][1];
        return lenx*lenx + leny*leny;

//        return Math.pow(Math.abs(a[rowa][0] - a[rowb][0]),2) + Math.pow(Math.abs(a[rowa][1] - a[rowb][1]),2);
    }
}
