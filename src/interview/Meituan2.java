package interview;

import java.util.*;

/**
 * created by zsj in 20:19 2018/9/6
 * description:
 **/
public class Meituan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int t = scanner.nextInt();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = scanner.nextInt();
        }
        int resNum = 0;
        if (t<=1) {
            System.out.println(n-k+1);
            return;
        }
        HashMap<Integer, Integer> map = new HashMap<>(k);
        for (int i = 0; i <= n-k; i++) {
            map.clear();
            for (int j = i; j < i+k; j++) {
                if (map.containsKey(res[j])) {
                    int tmp = map.get(res[j]) + 1;
                    if (tmp >= t) {
                        resNum++;
                        break;
                    }
                    map.put(res[j], tmp);
                }
                else {
                    if (1 >= t) {
                        resNum++;
                        break;
                    }
                    map.put(res[j],1);
                }
            }
        }
        System.out.println(resNum);
//        getRes();
    }

    public static void getRes() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int t = scanner.nextInt();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = scanner.nextInt();
        }
        int resNum = 0;
        int[] tmp = new int[k];
        for (int i = 0; i <= n-k; i++) {
            tmp = Arrays.copyOfRange(res,i,i+k);
            Arrays.sort(tmp);
            for (int j = 0; j < k-t; j++) {

            }
        }
    }
}
