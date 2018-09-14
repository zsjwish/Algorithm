package books;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/**
 * created by zsj in 11:27 2018/9/14
 * description:
 **/
public class JVMTest {

    public static Integer i1 = 8;
    public static Integer i2 = new Integer(8);
    public static void main(String[] args) {
        Integer i3 = 8;
        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
        System.out.println(i2 == i3);
        List<Integer> list = new LinkedList<>();
    }
}
