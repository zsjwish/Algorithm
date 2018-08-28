package selfTest;

/**
 * created by zsj in 14:44 2018/8/26
 * description:
 **/
public class ClassTest {
    public static int price = 50;
    public static final int clazz = 9;
    final int anInt;
    int a1 = 1;
    int a2 = 2;
    final int s1 = a1 + a2;
    

    public ClassTest(int anInt) {
        this.anInt = anInt;
    }

    public static void setPrice(int newPrice) {
        price = newPrice;
        System.out.println("set price " +ClassTest.price);
    }

    public int age = 10;
    public void setAge(int newAge) {
        this.age = newAge;

    }

    public static void main(String[] args) {
        System.out.println(ClassTest.price);
        ClassTest.setPrice(60);
        System.out.println(ClassTest.price);

    }
}
