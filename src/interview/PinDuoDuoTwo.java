package interview;

import java.util.Scanner;

/**
 * created by zsj in 18:58 2018/5/10
 * description:做题要理思路，要仔细，先写核心，再看边缘。
 **/
public class PinDuoDuoTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int tmp = sc.nextInt();
        int lTor = getFromLToR(s);
        int rightAn = getRightAns(s);
        if (tmp == lTor && tmp!= rightAn) {
            System.out.println("L");
        }
        else if (tmp != lTor && tmp == rightAn) {
            System.out.println("M");
        }
        else if (tmp == lTor && tmp == rightAn) {
            System.out.println("U");
        }
        else {
            System.out.println("I");
        }
    }

    public static int getFromLToR(String s) {
        String[] strings = s.split("\\+|\\*");
        int num = strings.length;
        int[] res = new int[num];
        for (int i = 0; i < num; i++) {
            res[i] = Integer.valueOf(strings[i]);
        }
//        System.out.println(Arrays.toString(res));
        int j = 0;
        for (int i = 0; i < s.length() && j < num; i++) {
            if (s.charAt(i) == '+') {
                res[j+1] += res[j];
                j++;
            }
            else if (s.charAt(i) == '*') {
                res[j+1] *= res[j];
                j++;
            }
        }
//        System.out.println(Arrays.toString(res));
//        System.out.println(res[num-1]);
        return res[num-1];
    }

    public static int getRightAns(String s) {
        String[] strings = s.split("\\+");
//        System.out.println(Arrays.toString(strings));
        int[] res = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            String tmp = strings[i];
            String[] twice = tmp.split("\\*");
            if (twice.length == 1) {
                res[i] = Integer.valueOf(tmp);
            }
            else {
                res[i] = Integer.valueOf(twice[0]) * Integer.valueOf(twice[1]);
            }
        }
//        System.out.println(Arrays.toString(res));
        int sum = 0;
        for (int i:res) {
            sum += i;
        }
//        System.out.println(sum);
        return sum;
    }

}
