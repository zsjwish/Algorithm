package leetcode;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * created by zsj in 23:58 2018/4/23
 * description:
 **/
public class Lee1 {
    public static void main(String[] args) {
        System.out.println(Long.bitCount(3));
        System.out.println(Long.bitCount(10));
        System.out.println(Long.bitCount(32));
        print();
        System.out.println();
        twoDimension();
    }
    public static void print() {
        int[] a = new int[]{10,15,16,49,31,33};
        System.out.println(Arrays.toString(a));
        for(int i : a){
            System.out.println(i);
        }
    }

    public static void twoDimension(){
        int[] a = {1,9,5,2,3,4,7,5,4};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
}

