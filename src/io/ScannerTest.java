package io;

import java.io.*;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Scanner;

/**
 * created by zsj in 21:18 2018/8/28
 * description:
 **/
public class ScannerTest {

    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        sc.useDelimiter("\n");
//        while (sc.hasNext()) {
//            System.out.println("输入的内容是：" + sc.next());
//        }
//        while (sc.hasNextLong()) {
//            System.out.println("输入的内容是：" + sc.next());
//        }
//        Scanner scanner = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = null;
//        while ((str = br.readLine()) !=null) {
//            System.out.println("用户输入的内容是：" + str);
//        }

//        Map<String, String> env = System.getenv();
//        for (String name : env.keySet()) {
//            System.out.println(name + "---->" + env.get(name));
//        }
//
//        System.out.println(System.getenv("JAVA_HOME"));
//        Properties properties = System.getProperties();
//        properties.store(new FileOutputStream("pro.txt"), "zsjPro");
//        System.out.println(System.identityHashCode(new String("hello")));

        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        runtime.exec("notepad.exe");

        String string = new String("hello");



    }
}

