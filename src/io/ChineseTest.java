package io;

import java.io.*;

/**
 * created by zsj in 11:27 2018/6/19
 * description:
 **/
public class ChineseTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/zsj/Desktop/101.txt"),"gbk"));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/Users/zsj/Desktop/102.txt"),"gbk"));
            String s = "";
            while ((s=br.readLine())!=null) {
                bw.write(s+"\n");
            }
            bw.flush();
        }catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            br.close();
            bw.close();
        }
    }
}
