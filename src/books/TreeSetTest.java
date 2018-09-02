package books;

import java.sql.Struct;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * created by zsj in 15:43 2018/9/1
 * description:
 **/
public class TreeSetTest {
    public static void main(String[] args) {
//        TreeSet treeSet = new TreeSet();
//        treeSet.add(9);
//        treeSet.add(49);
//        System.out.println(treeSet);
//        System.out.println(treeSet.first());
//        System.out.println(treeSet.last());
//        for (int i = 0; i < 11; i++) {
//            treeSet.add(i*3);
//        }
//        System.out.println(treeSet);
//        SortedSet treeSet1 = treeSet.headSet(16);
//        System.out.println(treeSet1);
//        treeSet1.add(4);
//        System.out.println(treeSet1);

        Student student1 = new Student("zsj", 80, 60, 100);
        Student student5 = new Student("zsj2", 80, 60, 100);
        System.out.println(student1 == student5);
        Student student2 = new Student("amy", 85, 80, 20);
        Student student3 = new Student("tony", 90, 70, 99);
        Student student4 = new Student("vector", 100, 100, 50);
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);

        System.out.println(treeSet);
        student1.setChineseGrade(10000);
        System.out.println(treeSet);
        Student student6 = new Student("yll",10,10,10);
        treeSet.add(student6);
        System.out.println(treeSet);
    }
}
