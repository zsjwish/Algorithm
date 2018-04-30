package leetcode;

/**
 * created by zsj in 12:30 2018/4/30
 * description:给定一个整数，写一个函数来判断它是否是2的幂。
 **/
public class Lee231 {

    public static void main(String[] args) {
        Lee231 lee231 = new Lee231();
//        lee231.isPowerOfTwo(3);
        System.out.println(Integer.bitCount(6));
        System.out.println(-1>>>1);
        System.out.println(1>>>1);


    }
    public boolean isPowerOfTwo(int n) {
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            }
            else {
                System.out.println(false);
                return false;
            }
        }
        if (n == 1) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

}
