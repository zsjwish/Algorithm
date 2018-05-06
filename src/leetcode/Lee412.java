package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * created by zsj in 21:28 2018/5/6
 * description:写一个程序，输出从 1 到 n 数字的字符串表示。
 * 1. 如果 n 是3的倍数，输出“Fizz”；
 * 2. 如果 n 是5的倍数，输出“Buzz”；
 * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 **/
public class Lee412 {

    public static void main(String[] args) {

    }

    public List<String> fizzBuzz(int n) {
        List<String> res = new LinkedList<>();
        if (n <= 0) {
            return res;
        }
        for (int i = 1; i <= n; i++) {
            StringBuffer sb = new StringBuffer();
            if (i % 3 == 0) {
                sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            if (sb.length() == 0) {
                sb.append(n);
            }
            res.add(sb.toString());
        }
        return res;
    }

}
