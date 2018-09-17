package books;

/**
 * created by zsj in 21:10 2018/9/17
 * description:
 **/

class Base {
    int x = 2;
    public int get() {
        return x;
    }
}


class SubClass extends Base{
    int x = 3;
    public int get() {
        return x;
    }
}

public class ExtendTest {
    public static void main(String[] args) {
        Base b = new SubClass();
        System.out.println(b.x);
        System.out.println(b.get());

        SubClass s = new SubClass();
        System.out.println(s.x);
        System.out.println(s.get());

        Base a = new Base();
        System.out.println(a.x);
        System.out.println(a.get());
    }
}
