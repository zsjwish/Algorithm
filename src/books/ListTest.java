package books;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * created by zsj in 21:35 2018/9/2
 * description:
 **/

class A{
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

public class ListTest {
    public static void main(String[] args) {
//        List books = new ArrayList();
//        books.add(new String("hello"));
//        books.add(new String("你好"));
//        books.add(new String("welcome"));
//        System.out.println(books);
//        books.remove("hello");
//        System.out.println(books);
//        books.removeAll(Arrays.asList("welcome"));

//        books.remove(new A());
//        System.out.println(books);
//        books.remove(new A());
//        System.out.println(books);

//        ArrayList arraylist = new ArrayList();
//        arraylist.ensureCapacity(20);
//        System.out.println(arraylist.size());
//
//        List list = Arrays.asList(1,2,3);
//        System.out.println(list.size());
//        list.set(1,100);
//        System.out.println(list);
//        list.add(0);
        List<List<Integer>> listList = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            listList.add(new ArrayList<>());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(listList.get(i).contains(1));
            for (int j = 0; j < 10; j++) {
                listList.get(i).add(j);
            }
        }
        System.out.println(listList.get(0));
        System.out.println(listList.get(1));
        System.out.println(listList.get(2));
        System.out.println(listList.get(3));
        System.out.println(listList.get(4));
    }
}
