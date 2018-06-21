package io;

import java.io.PipedInputStream;

/**
 * created by zsj in 13:14 2018/6/20
 * description:
 **/
public class PipeTest {
    public static void main(String[] args) {
        try {
            throw new Exception("参数越界");
        }catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("1");
//            e.printStackTrace();
            e.printStackTrace();
        }
        System.out.println("2");
    }
}
