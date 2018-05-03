package leetcode;

/**
 * created by zsj in 10:53 2018/5/3
 * description:给定一个整数 (32位有符整数型)，请写出一个函数来检验它是否是4的幂。
 * 思路：像这种2,4,8。。。的幂最好利用移位来操作。
 **/
public class Lee342 {

    public static void main(String[] args) {
        Lee342 lee342 = new Lee342();
        System.out.println(lee342.isPowerOfFour(5));
    }

    public boolean isPowerOfFour(int num) {
        int flag = 1;
        int four = 0;
        while (flag <= 32) {
            if ((num&1) == 1) {
                if (flag % 2 == 0) {
                    return false;
                }
                else {
                    four++;
                }
            }
            num >>= 1;
            flag++;
        }
        return four==1;
    }

}
