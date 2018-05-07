package interview;

import java.util.Scanner;

/**
 * created by zsj in 19:25 2018/5/7
 * description:
 **/
public class One51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] tmp = a.split(";");
        getRes(tmp[0], tmp[1]);
    }

    public static boolean getRes(String a, String b) {
        for (int i = 0; i < b.length(); i++) {
            String tmp = b.charAt(i) + "";
            if (!a.contains(tmp)) {
                System.out.println(false);
                return false;
            }
        }
        System.out.println(true);
        return true;
    }
}
