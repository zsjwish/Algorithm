package io;

/**
 * created by zsj in 22:23 2018/8/28
 * description:
 **/
public class StringTest {
    public static void main(String[] args) {

        String str = new String("abcdefghijkabcaba");
        String str2 = new String("h134");
        System.out.println(str.concat(str2));
        System.out.println(str);
        System.out.println(str2);

        System.out.println(str.compareTo(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.lastIndexOf('a',8));
        System.out.println(str.indexOf('a',8));
    }
}
