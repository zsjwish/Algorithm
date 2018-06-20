package io;

import java.io.*;

/**
 * created by zsj in 13:31 2018/6/20
 * description:
 **/
public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        int b = 0;
        try {
            isr = new InputStreamReader(new FileInputStream("C:/Users/zsj/Desktop/101.txt"),"gbk");
            osw = new OutputStreamWriter(new FileOutputStream("C:/Users/zsj/Desktop/104.txt"),"gbk");
            while ((b=isr.read())!=-1) {
                osw.write(b);
            }
            osw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            isr.close();
            osw.close();
        }
    }
}

