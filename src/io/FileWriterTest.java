package io;

import java.io.*;

/**
 * created by zsj in 18:04 2018/6/17
 * description:
 **/
public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fw = null;
        BufferedReader bfr = null;
        int b = 0;
        try {
            bfr = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/zsj/Desktop/7.txt"),"gb2312"));
            fw = new FileWriter("C:/Users/zsj/Desktop/6.txt");
            for (int i = 0; i < 60000; i++) {
                fw.write(i);
            }
            fw.write("你是一个帅气的小胡子");
            System.out.println(bfr.read());
            System.out.println(bfr.readLine());
//            while ((b=bfr.readLine())!=-1) {
//                System.out.println(b);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            fw.close();
        }
    }
}
