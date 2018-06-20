package io;

import java.io.*;

/**
 * created by zsj in 10:02 2018/6/19
 * description:
 **/
public class BufferFiled {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/zsj/Desktop/15.txt"),"gbk"));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/Users/zsj/Desktop/16.txt"),"gbk"));
            String s = "你好nihao123#\n";
            bw.write(s);
            bw.flush();
            while ((s=br.readLine())!=null) {
                bw.write(s+"\r\n");
                System.out.println(s+"\r\n");
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {

        }
    }
}
