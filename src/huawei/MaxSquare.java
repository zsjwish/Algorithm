package huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * created by zsj in 16:30 2019/7/20
 * description:
 **/
public class MaxSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(maxSqureResult(n, k));
    }
    public static int maxSqureResult(int n, int k) {
        //如果能显示的数字为0，即n==0,则直接异常
        if (n < 1 || n > 9) {
            return -1;
        }
        //存放每次得到的结果
        Set<Integer> res = new HashSet<>(k);
        int max = k;
        int tmp = k;
        while(true) {
            //平方
            tmp *= tmp;
            //计算是否需要右移，如果需要的话应该右移多少位
            int rightMove = String.valueOf(tmp).length() - n;
            //如果总位数小于n,则不需要右移，否则需要
            int right = rightMove > 0 ? rightMove : 0;
            //除以10的指数，相当于十进制右移
            tmp = tmp / ((int)Math.pow(10, right));
            //判断如果之前已经保存次数，则说明结果开始循环，则跳出循环
            if (res.contains(tmp)) {
                break;
            }
            else {
                //找出最大的数
                if (tmp > max) {
                    max = tmp;
                }
                //每次将最新结果添加到set中
                res.add(tmp);
            }
        }
        return max;
    }
}
