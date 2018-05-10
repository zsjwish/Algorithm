package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * created by zsj in 18:58 2018/5/10
 * description:
 **/
public class PinDuoDuoFour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<int[]> listA = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int counts = sc.nextInt();
            int[] res = new int[counts+1];
            res[0] = counts;
            for (int j = 1; j < counts + 1; j++) {
                res[j] = sc.nextInt();
            }
            listA.add(res);
        }
        int m = sc.nextInt();
        List<int[]> listB = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int counts = sc.nextInt();
            int[] res = new int[counts+1];
            res[0] = counts;
            for (int j = 1; j < counts + 1; j++) {
                res[j] = sc.nextInt();
            }
            listB.add(res);
        }
        getRes(listA, listB);
    }

    public static void getRes(List<int[]> listA, List<int[]> listB) {
        for (int[] b: listB) {
            List<Integer> res = new ArrayList<>();
            int ath = 0;
            for (int[] a: listA) {
                ath++;
                int errortime = 0;
                if (Math.abs(b[0] - a[0]) <= 1) {
                    for (int i = 1; i < a.length; i++) {
                        if (contains(b, a[i])) {
                            continue;
                        }
                        else {
                            errortime++;
                            if (errortime >= 2) {
                                break;
                            }
                        }
                    }
                    if (errortime < 2) {
                        res.add(ath);
                    }
                }
            }
            System.out.print(res.size());
            for (int i:res) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }

    public static boolean contains(int[] nums, int k) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == k) {
                return true;
            }
        }
        return false;
    }
}
