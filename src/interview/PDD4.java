package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * created by zsj in 19:03 2018/8/30
 * description:
 **/
public class PDD4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int length = scanner.nextInt();
        List<String> list = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            list.add(scanner.next());
        }
        char[][] chars = new char[length][num];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < num; j++) {
                chars[i][j] = list.get(j).charAt(i);
            }
            Arrays.sort(chars[i]);
        }
        int[] chatAt = new int[chars.length];
        System.out.println(Arrays.toString(chatAt));
        while (true) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < chars.length; i++) {
                sb.append(chars[i][chatAt[i]]);
                chatAt[i]++;
                if (chatAt[i] == num) {
                    chatAt[i] = 0;
                }
            }
            if (!list.contains(sb.toString())) {
                System.out.println(sb.toString());
                return;
            }
        }
    }
}
