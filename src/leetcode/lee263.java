package leetcode;

/**
 * created by zsj in 17:55 2018/4/20
 * description: 丑数I，丑数，因子只有2,3,5的数字。题目：判断一个数是否是丑数。
 **/
public class lee263 {

    public static void main(String[] args) {
        lee263 lee263 = new lee263();
        lee263.isUgly(16);
    }
    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        if (num == 1) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}
