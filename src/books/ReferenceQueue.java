package books;

import java.lang.ref.WeakReference;

/**
 * created by zsj in 19:50 2018/8/28
 * description:
 **/
public class ReferenceQueue {
    public static void main(String[] args) {
        String str = new String("java基础");
        WeakReference wr = new WeakReference(str);
        str = null;
        System.out.println(wr.get());
        System.gc();
        System.out.println(wr.get());
    }
}
