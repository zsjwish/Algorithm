package interview;

import java.util.Arrays;
import java.util.Scanner;

/**
 * created by zsj in 14:56 2018/8/11
 * description:
 **/
public class Wangyi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int classTime = scanner.nextInt();
        int weakTime = scanner.nextInt();
        int[] interestedPoint = new int[classTime];
        int[] weakOrSleep = new int[classTime];
        for (int i = 0; i < classTime; i++) {
            interestedPoint[i] = scanner.nextInt();
        }
        for (int i = 0; i < classTime; i++) {
            weakOrSleep[i] = scanner.nextInt();
        }
        System.out.println(classTime);
        System.out.println(weakTime);
        System.out.println(Arrays.toString(interestedPoint));
        System.out.println(Arrays.toString(weakOrSleep));

        long base = 0;
        for (int i = 0; i < classTime; i++) {
            if (weakOrSleep[i]==1) {
                base+=interestedPoint[i];
            }
        }
        long max = 0;
        for (int i = 0; i < classTime-weakTime; i++) {
            if (weakOrSleep[i] == 1) {
                continue;
            }
            long maxTmp = 0;
            for (int j = 0; j < weakTime; j++) {
                if (weakOrSleep[j+i] == 0) {
                    maxTmp += interestedPoint[j+i];
                }
            }
            max = Math.max(max, maxTmp);
        }
        System.out.println(base + max);
    }
}
