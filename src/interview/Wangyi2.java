package interview;


import java.util.Arrays;
import java.util.Scanner;

/**
 * created by zsj in 14:56 2018/8/11
 * description:
 **/
public class Wangyi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stackNum = scanner.nextInt();
        int[] appleNum = new int[stackNum];
        appleNum[0] = scanner.nextInt();
        for (int i = 1; i < stackNum; i++) {
            appleNum[i] = scanner.nextInt() + appleNum[i-1];
        }
        int queryTimes = scanner.nextInt();
        int[] queryNum = new int[queryTimes];
        for (int i = 0; i < queryTimes; i++) {
            queryNum[i] = scanner.nextInt();
        }

        int[] res = new int[queryTimes];
        for (int i = 0; i < queryTimes; i++) {
            if (queryNum[i] <= appleNum[0]) {
                res[i] = 1;
                continue;
            }
            for (int j = 0; j < stackNum; j++) {
                if (queryNum[i] > appleNum[j] && queryNum[i] <= appleNum[j+1]) {
                    res[i] = j+2;
                    break;
                }
            }
        }
        for (int tmp : res) {
            System.out.println(tmp);
        }
    }
}
