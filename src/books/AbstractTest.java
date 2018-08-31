package books;

/**
 * created by zsj in 20:45 2018/8/31
 * description:
 **/
public abstract class AbstractTest {

    public static void test1() {
        System.out.println("可以有静态方法");
    }

    public void test2(){
        System.out.println("可以有普通方法");
    }

    public abstract void test3();

    public static void main(String[] args) {
        System.out.println("可以有main");
    }

}
