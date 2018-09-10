package leetcode;

import javafx.collections.transformation.SortedList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * created by zsj in 22:44 2018/9/10
 * description:
 **/
public class Lee567 {
    public static void main(String[] args) {
        System.out.println(checkInclusion("adc","dcda"));
    }

//    public static boolean checkInclusion(String s1, String s2) {
//        int length = s1.length();
//        int low = 0;
//        char[] chars1 = s1.toCharArray();
//        char[] chars2;
//        Arrays.sort(chars1);
//        while (low + length <= s2.length()) {
//            chars2 = s2.substring(low, low+length).toCharArray();
//            Arrays.sort(chars2);
//            if (Arrays.equals(chars1, chars2)) {
//                return true;
//            }
//            low++;
//        }
//        return false;
//    }
//    public static boolean checkInclusion(String s1, String s2) {
//        int length = s1.length();
//        int low = 0;
//        List<Character> list = new SortedList(s1)
//        char[] chars1 = s1.toCharArray();
//        char[] chars2 = s2.substring(0, length).toCharArray();
//        Arrays.sort(chars1);
//        for (int i = 0; i + length <= s2.length(); i++) {
//            Arrays.sort(chars2);
//            if (Arrays.equals(chars1, chars2)) {
//                return true;
//            }
//
//        }
//        return false;
//    }
}
