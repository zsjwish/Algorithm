package io;

import java.io.*;

/**
 * created by zsj in 16:29 2018/6/17
 * description:
 **/
public class FIleReaderTest {
    public static void main(String[] args) throws IOException {
        FileWriter fw = null;
        FileReader fr = null;
        BufferedInputStream fi = null;
        FileOutputStream fo1 = null;
        FileOutputStream fo2 = null;
        FileOutputStream fo3 = null;
        int times_fi1 = 0;
        int times_fi2 = 0;
        int times_fi3 = 0;
        int times_fr = 0;
        int b = 0;
        byte[] bytes = new byte[5];
        byte[] bytes1 = new byte[10];
        try {
            fi = new BufferedInputStream(new FileInputStream("C:/Users/zsj/Desktop/1.txt"));
            fi.mark(0);
            fr = new FileReader("C:/Users/zsj/Desktop/1.txt");
            fw = new FileWriter("C:/Users/zsj/Desktop/5.txt");
            fo1 = new FileOutputStream("C:/Users/zsj/Desktop/2.txt");
            fo2 = new FileOutputStream("C:/Users/zsj/Desktop/3.txt");
            fo3 = new FileOutputStream("C:/Users/zsj/Desktop/4.txt");
            while ((b=fi.read())!=-1) {
                fo1.write(b);
                times_fi1++;
            }
            fi.reset();
            while ((b=fi.read(bytes))!=-1) {
                fo2.write(bytes);
                times_fi2++;
            }
            fi.reset();
            while ((b=fi.read(bytes1))!=-1) {
                fo3.write(bytes1);
                times_fi3++;
            }
            fi.reset();
            while ((b=fr.read())!=-1) {
                fw.write(b);
                times_fr++;
            }
            System.out.println(fi.available());

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            fi.close();
            fo1.close();
            System.out.println(times_fi1);
            System.out.println(times_fi2);
            System.out.println(times_fi3);
            System.out.println(times_fr);
        }

    }
}
