package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

/**
 * created by zsj in 16:23 2018/6/12
 * description:
 **/
public class IO1 {
    public static void main(String[] args) {
        try {
            BufferedInputStream is = new BufferedInputStream(new FileInputStream("C:/Users/zsj/Desktop/io1.txt"),20);
            byte[] input = new byte[8];
            System.out.println(is.available());

            System.out.println(is.read());
            is.mark(1);
            System.out.println(is.read());

            System.out.println(is.read(input));
//            System.out.println(is.read(input));
            System.out.println(is.markSupported());
//            System.out.println(is.read(input));
            is.reset();
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
        } catch (Exception e) {

        }
        finally {

        }
    }
}
