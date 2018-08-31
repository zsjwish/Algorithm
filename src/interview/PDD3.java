package interview;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * created by zsj in 19:03 2018/8/30
 * description:
 **/
public class PDD3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        float res =  a / (float)b;
        System.out.println(res);
        String tmp = String.valueOf(res);
        System.out.println(tmp);
        String[] strings = tmp.split("\\.");
        System.out.println(Arrays.toString(strings));
        if (strings.length <= 1 || strings[1].equals("0")) {
            System.out.println(strings[0].length());
            System.out.println(0);
            return;
        }

        String str = strings[1];
        String pattern = "(\\d+?)\\1+";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        System.out.println(m.matches());
        System.out.println("重复数字："+m.group(1));

    }
}
