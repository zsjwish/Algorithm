package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * created by zsj in 16:39 2018/6/18
 * description:
 **/
public class AssessFIle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RandomAccessFile raf = null;
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fw = new FileWriter("C:/Users/zsj/Desktop/12.txt");
            fw.write("213");
            raf = new RandomAccessFile("C:/Users/zsj/Desktop/10.txt","rw");
            String s;
            while (!(s=sc.nextLine()).equals("#")) {
                raf.write(s.getBytes("utf-8"));
            }
            while ((s = raf.readLine())!=null) {
                System.out.println(new String(s.getBytes("8859_1"),"gbk"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        finally {

        }
    }
}
