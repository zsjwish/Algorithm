package books;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * created by zsj in 10:53 2018/9/1
 * description:
 **/
public class IteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i*i+1);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object tmp = iterator.next();
            System.out.println(tmp);
            if ((int)tmp > 50) {
                iterator.remove();
            }
        }
        System.out.println();
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}