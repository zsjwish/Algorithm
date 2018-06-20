package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * created by zsj in 10:36 2018/6/19
 * description:
 **/
public class FileOutputTest {
    public static void main(String[] args) {
        OutputStreamWriter osw = null;
        InputStreamReader isr = null;
        int b = 0;
        int times = 0;
        try {
            osw = new OutputStreamWriter(new FileOutputStream("C:/Users/zsj/Desktop/16.txt",true),"utf-8");
//            osw.write("\n");
            osw.write("\n你好啊123sad");
            osw.flush();
            isr = new InputStreamReader(new FileInputStream("C:/Users/zsj/Desktop/15.txt"),"utf-8");
            System.out.println(isr.getEncoding());
            while ((b = isr.read())!=-1) {
                osw.write(b);
                times++;
            }
            System.out.println(times);
            osw.flush();
        }catch (Exception e) {
            e.printStackTrace();
        }
        finally {

        }
    }
}
