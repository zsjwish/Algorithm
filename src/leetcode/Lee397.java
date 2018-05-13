package leetcode;

/**
 * created by zsj in 16:28 2018/5/13
 * description:
 * 给定一个正整数 n，你可以做如下操作：
 * 1. 如果 n 是偶数，则用 n / 2替换 n。
 * 2. 如果 n 是奇数，则可以用 n + 1或n - 1替换 n。
 * n 变为 1 所需的最小替换次数是多少？
 **/
public class Lee397 {

    public static void main(String[] args) {
        Lee397 lee397 = new Lee397();
        System.out.println(lee397.integerReplacement1(8));
        System.out.println(lee397.integerReplacement1(7));
        System.out.println(lee397.integerReplacement1(2147483647));
    }

    private int integerReplacement(int n) {
        int[] dp = new int[n];
        for (int i = 1; i < dp.length+1; i++) {

        }
        return 0;
    }

    public int integerReplacement1(int n) {
        return (int)getRea(n);
    }

    public long getRea(long n) {
        if (n < 3) {
            return n - 1;
        }
        if (n % 2 == 0) {
            return 1 + getRea( n /2);
        }
        else {
            return Math.min(getRea(n-1), getRea(n+1)) +1;
        }
    }
}

