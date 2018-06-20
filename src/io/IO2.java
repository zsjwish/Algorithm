package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * created by zsj in 15:58 2018/6/17
 * description:FileInputStream FileOutputStream read write 基本用法
  **/
public class IO2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = null;
        FileOutputStream fo = null;
        byte[] tmp = new byte[1000];
        int b = 0;
        try {
            fi = new FileInputStream("C:/Users/zsj/Desktop/2.png");
            fo = new FileOutputStream("C:/Users/zsj/Desktop/4.png");
            while ((b = fi.read(tmp))!=-1) {
                fo.write(tmp);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            fi.close();
            fo.close();
        }
        System.out.println("转移结束");
    }
}
