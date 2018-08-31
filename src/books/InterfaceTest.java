package books;

/**
 * created by zsj in 20:55 2018/8/31
 * description:
 **/
public interface InterfaceTest {
    static void test12(){
        System.out.println("static");
    }

    int a = 1;

    public static void main(String[] args) {
        test12();
    }
}
