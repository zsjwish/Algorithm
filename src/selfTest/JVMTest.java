package selfTest;

import jdk.nashorn.internal.codegen.ObjectClassGenerator;

/**
 * created by zsj in 23:28 2018/8/22
 * description:
 **/
public class JVMTest {
    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja1").append("va").toString();
        System.out.println(str2.intern() == str2);

        Boolean b = false;
        Boolean b1 = new Boolean("True");
        Boolean b2 = new Boolean("hello");
        boolean b3 = b2.booleanValue();
        boolean b4 = b1;
        System.out.println("b" + b);
        System.out.println("b1" + b1);
        System.out.println("b2" + b2);
        System.out.println(Integer.parseInt("123"));

        System.out.println(Integer.compare(3, 5));
        Object o = new Object();
        Object o1 = new Object();
        System.out.println(o);
        System.out.println(o1.toString());

        String s1 = "java";
        String s2 = "java2";
        String s3 = "java3";
        String s4 = s1 + s2;
        System.out.println(s4);
        s1 = "java1";
        s4 = s1 + s2;
        System.out.println(s4);

    }
}
