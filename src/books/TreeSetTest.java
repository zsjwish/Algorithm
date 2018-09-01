package books;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * created by zsj in 15:43 2018/9/1
 * description:
 **/
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(9);
        treeSet.add(49);
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        for (int i = 0; i < 11; i++) {
            treeSet.add(i*3);
        }
        System.out.println(treeSet);
        SortedSet treeSet1 = treeSet.headSet(16);
        System.out.println(treeSet1);
        treeSet1.add(4);
        System.out.println(treeSet1);
    }
}
