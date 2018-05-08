package interview;

import java.util.Arrays;
import java.util.Scanner;

/**
 * created by zsj in 19:35 2018/5/7
 * description:
 **/
public class Two51 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
        String s = "GGGGRRBBBGRBGGGGGRRBBBGRBGGGGGRRBBBGRBGGGGGRRBBBGRBG";
        getRes1(s.toCharArray());
    }

    public static char[] getRes1(char[] chars) {
        int low = 0, high = chars.length - 1;
        for (int i = 0; i < chars.length && low < high; i++) {
            while (chars[i] == 'R' && i > low) {
                swap(chars, i, low++);
                i--;
            }
            while (chars[i] == 'B' && i < high) {
                swap(chars, i, high--);
                i--;
            }
        }
        System.out.println(Arrays.toString(chars));
        StringBuffer sb = new StringBuffer();
        for (char c : chars) {
            sb.append(c);
        }
        System.out.println(sb.toString());
        return chars;
    }

    public static void swap(char[] c, int i, int j) {
        char tmp = c[i];
        c[i] = c[j];
        c[j] = tmp;
    }

    public static void getRes(char[] chars) {
        int numR = 0, numG = 0, numB = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'B') {
                numB++;
            }
            else if (chars[i] == 'G') {
                numG++;
            }
            else {
                numR++;
            }
        }
        int i = 0;
        while (numR-->0){
            chars[i++] = 'R';
        }
        while (numG-- >0){
            chars[i++] = 'G';
        }
        while (numB-->0){
            chars[i++] = 'B';
        }
        StringBuffer sb = new StringBuffer();
        for (char c : chars) {
            sb.append(c);
        }
        System.out.println(sb.toString());
    }

}
