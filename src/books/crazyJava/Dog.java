package books.crazyJava;

import java.util.Objects;

/**
 * created by zsj in 15:50 2019/7/28
 * description:
 **/
public class Dog extends Animal {
    {
        System.out.println("Dog初始化块");
    }

    static {
        System.out.println("Dog static初始化块");
    }
    public Dog() {
        System.out.println("Dog构造器");
    }

    public static void main(String[] args) {
        Integer ina = 2;
        Integer inb = 2;
        System.out.println(Objects.equals(ina, inb));
        System.out.println(ina == inb);

        Integer inc = 128;
        Integer ind = 128;
        System.out.println(inc == ind);

    }
}
