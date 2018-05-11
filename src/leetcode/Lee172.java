package leetcode;

/**
 * created by zsj in 14:02 2018/5/2
 * description:给定一个整数 n，返回 n! 结果尾数中零的数量。
 **/
public class Lee172 {

    public static void main(String[] args) {
        Lee172 lee172 = new Lee172();
        System.out.println(lee172.trailingZeroes(30));
    }

    public Long jiec(int n) {
        if (n == 0 || n == 1) {
            return 1L;
        }
        return (long)n * (long)jiec(n-1);
    }

    public int trailingZeroes(int n) {
        if (n / 5 < 1) {
            return 0;
        }
        else {
            return n / 5 + trailingZeroes(n / 5);
        }
    }

}
