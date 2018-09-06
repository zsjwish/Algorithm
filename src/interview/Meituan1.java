package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * created by zsj in 20:59 2018/9/6
 * description:
 **/
public class Meituan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int point = scanner.nextInt();
        int[][] path = new int[point-1][2];
        List<Vector<Integer>> list = new ArrayList<>(point-1);
        for (int i = 0; i < point-1; i++) {
            for (int j = 0; j < 2; j++) {
                path[i][j] = scanner.nextInt();
            }
        }
        System.out.println(list);
        for (int i = 0; i < point-1; i++) {
            for (int j = i+1; j < point-1; j++) {
                if (path[i][1] == path[j][0]) {

                }
            }
        }


//        System.out.println(4);
    }
}
