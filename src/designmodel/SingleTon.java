package designmodel;

/**
 * created by zsj in 17:17 2018/8/26
 * description:
 **/

/**
 * 单例模式分为饿汉和懒汉两种情况，注意synchronize的使用
 * 下面是饿汉模式，线程安全
 **/
public class SingleTon {
    private static SingleTon singleTon;

    private SingleTon() {

    }

    static {
        singleTon = new SingleTon();
    }

    public static SingleTon getSingleTon() {
        return singleTon;
    }
}

/**
 * 懒汉模式,线程不安全，所以要加synchronize
 */
class SingleTon2 {
    private static SingleTon2 singleTon2;

    private SingleTon2() {

    }

    public static synchronized SingleTon2 getSingleTon2() {
         if (singleTon2 == null) {
             singleTon2 = new SingleTon2();
         }
         return singleTon2;
    }
}
