package leetcode;

/**
 * created by zsj in 11:15 2018/5/3
 * description:
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 * 注意：不要使用任何内置的库函数，如  sqrt。
 **/
public class Lee367 {

    public static void main(String[] args) {
        Lee367 lee367 = new Lee367();
        System.out.println(lee367.isPerfectSquare(2147483647));
    }

    public boolean isPerfectSquare(int num) {
        if (num == 0) {
            return true;
        }
        for (int i = 1; i <= num; i++) {
            if (num / i == i && num % i == 0) {
                return true;
            }
            else if (num / i < i) {
                return false;
            }
        }
        return false;
    }

}
