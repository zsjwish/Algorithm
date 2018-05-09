package sort;

import java.util.Arrays;
import java.util.Collections;

/**
 * created by zsj in 13:43 2018/5/9
 * description:
 **/
public class Compare implements Comparable<Compare> {
    private String name;
    private int age;

    public Compare(String name ,int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Compare o) {
        if (this.age > o.age) return -1;
        if (this.age < o.age) return 1;
        return 0;
    }

    public static void main(String[] args) {
        Compare[] compares = new Compare[6];
        for (int i = 0; i < 6; i++) {
            Compare compare = new Compare("zsj" + i, (i+5)*3);
            compares[i] = compare;
        }
        print(compares);
        Arrays.sort(compares);
        System.out.println("-------------------");
        print(compares);
    }

    public static void print(Compare[] compares) {
        for (Compare c : compares) {
            System.out.println("name: " + c.name + "  age: " + c.age);
        }
    }
}
