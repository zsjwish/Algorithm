package leetcode;

/**
 * created by zsj in 14:36 2018/4/30
 * description:给出一个整数，写一个函数来确定这个数是不是3的一个幂。
 **/
public class Lee326 {
    public static void main(String[] args) {
        Lee326 lee326 = new Lee326();
        lee326.isPowerOfThree(27);
    }

    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            System.out.println(false);
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        System.out.println(n == 1);
        return n == 1;

    }
}
