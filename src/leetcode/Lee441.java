package leetcode;

/**
 * created by zsj in 10:12 2018/5/7
 * description:你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
 * 给定一个数字 n，找出可形成完整阶梯行的总行数。
 * n 是一个非负整数，并且在32位有符号整型的范围内
 **/
public class Lee441 {

    public static void main(String[] args) {
        Lee441 lee441 = new Lee441();
        lee441.arrangeCoins(8);
    }

    public int arrangeCoins(int n) {
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            n -= i;
            count++;
        }
        System.out.println(count);
        return count;
    }

}
