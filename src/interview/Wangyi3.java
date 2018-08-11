package interview;
import java.util.Scanner;

/**
 * created by zsj in 16:27 2018/8/11
 * description:
 **/
public class Wangyi3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anum = scanner.nextInt();
        int znum = scanner.nextInt();
        long resNum = scanner.nextLong();
        long res = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < anum; i++) {
            sb.append("0");
        }
        for (int i = 0; i < znum; i++) {
            sb.append("1");
        }
        long max = Long.valueOf(sb.toString());
        System.out.println(max);
        System.out.println();
        for (long i = 0; i < Math.pow(2, znum+anum); i++) {
            if (Long.bitCount(i) == znum) {
                res++;
                if (res == resNum) {
                    String tmp = Long.toBinaryString(i);
                    long num = anum + znum - tmp.length();
                    StringBuilder stringBuilder = new StringBuilder();
                    for (long j = 0; j < num; j++) {
                        stringBuilder.append("0");
                    }
                    stringBuilder.append(tmp);
                    System.out.println(stringBuilder.toString().replace('1','z').replace('0','a'));
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
