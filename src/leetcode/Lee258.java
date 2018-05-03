package leetcode;

/**
 * created by zsj in 9:59 2018/5/3
 * description:给一个非负整数 num，反复添加所有的数字，直到结果只有一个数字。
 * 例如:
 * 设定 num = 38，过程就像： 3 + 8 = 11, 1 + 1 = 2。 由于 2 只有1个数字，所以返回它。
 * 进阶:
 * 你可以不用任何的循环或者递归算法，在 O(1) 的时间内解决这个问题么？
 **/
public class Lee258 {
    public static void main(String[] args) {
        Lee258 lee258 = new Lee258();
        lee258.addDigits2(39);
    }
    //使用循环
    private int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int tmp = num;
        while (tmp > 10) {
            num = tmp;
            tmp = 0;
            while (num > 0) {
                tmp += num % 10;
                num /= 10;
            }
        }
        System.out.println(tmp);
        return tmp;
    }

    //首先使用递归
    public int addDigits1(int num) {
        if (num < 10) {
            System.out.println(num);
            return num;
        }
        int tmp = 0;
        while (num > 0) {
            tmp += num % 10;
            num /= 10;
        }
        return addDigits1(tmp);
    }

    /**
     * 数学方法：任何不能被9整除的数的各位相加都是num%9.
     * 能被9整除的如果大于0则相加是9，如果是0则是0.不知道为啥
     */
    public int addDigits2(int num) {
        if (num % 9 == 0) {
            return num == 0 ? 0 : 9;
        }
        return num % 9;
    }

}
