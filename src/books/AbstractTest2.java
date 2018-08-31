package books;

/**
 * created by zsj in 20:53 2018/8/31
 * description:
 **/
public class AbstractTest2 extends AbstractTest implements InterfaceTest{
    @Override
    public void test3() {
        System.out.println("overwrite");
    }

    public static void main(String[] args) {
        AbstractTest.test1();
        AbstractTest abstractTest = new AbstractTest2();
        abstractTest.test2();
        abstractTest.test3();
        InterfaceTest.test12();

    }


}
