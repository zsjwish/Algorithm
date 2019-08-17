package books.crazyJava;

/**
 * created by zsj in 10:40 2019/7/9
 * description:
 **/
public class Person {
    public static String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        Person p = new Person("zsj",18);
        System.out.println(p.name + " " + p.age);
        System.out.println(Person.name);
    }
}
