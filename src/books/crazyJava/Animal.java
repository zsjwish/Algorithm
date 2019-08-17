package books.crazyJava;

/**
 * created by zsj in 15:48 2019/7/28
 * description:
 **/
public class Animal {
    {
        System.out.println("Animal初始化块");
    }
    public static int a = 10;
    static {
        System.out.println("Animal static初始化块");
    }
    public Animal(){
        Animal.a++;
        System.out.println(Animal.a);
        System.out.println("Animal构造器");
    }
}
