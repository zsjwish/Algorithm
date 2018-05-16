package books;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * created by zsj in 17:22 2018/5/15
 * description:
 **/
public class AtomicIntegerTest extends Thread{

    static AtomicInteger num = new AtomicInteger();

    private static int iCount = 0;

    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName() + " " + i);
//            if (i==20) {

//                new Thread(new AtomicIntegerTest(),"新线程1").start();
//                new Thread(new AtomicIntegerTest(),"新线程2").start();
//            }
//        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,4);
        System.out.println(map.put(2,5));
        System.out.println(map);

    }

    private void iCountAdd() {
        for (int i = 0; i < 10000; i++) {
            iCount++;
        }
    }


    @Override
    public void run() {
        for (;num.get()<1000;num.getAndIncrement()) {
            System.out.println(Thread.currentThread().getName() + "  " + num.get());
        }
    }
}
