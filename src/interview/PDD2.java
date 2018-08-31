package interview;

import java.util.Arrays;
import java.util.Scanner;

/**
 * created by zsj in 19:03 2018/8/30
 * description:
 **/
public class PDD2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int high = scanner.nextInt();
        int width = scanner.nextInt();

        char[][] before = new char[high][width];
        for (int i = 0; i < high; i++) {
            before[i] = scanner.next().toCharArray();
        }
        for (int i = 0; i < width; i++) {
            change(before, i);
        }
        for (int i = 0; i < high; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(before[i][j]);
            }
            System.out.println();
        }
    }

    public static char[][] change(char[][] before, int widthNum) {
        int high = before.length;
        int stopNum = Integer.MAX_VALUE;
        for (int i = high-1; i >= 0; i--) {
            if (before[i][widthNum] == '.') {
                continue;
            }
            else if (before[i][widthNum] == 'o') {
                if (Integer.MAX_VALUE == stopNum) {
                    before[i][widthNum] = '.';
                }
                else {
                    before[i][widthNum] = '.';
                    before[stopNum-1][widthNum] = 'o';
                    stopNum --;
                }
            }
            else {
                stopNum = i;
            }
        }
        return before;
    }
}
