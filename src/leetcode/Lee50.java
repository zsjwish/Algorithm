package leetcode;

/**
 * created by zsj in 20:28 2018/5/6
 * description:实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 **/
public class Lee50 {

    public static void main(String[] args) {
        Lee50 lee50 = new Lee50();
        System.out.println(lee50.myPow(2,-2147483648));
    }
    //O(N)
    public double myPow1(double x, int n) {
            if (n == 0) {
                return 1;
            }
            if (x == 0) {
                return 0;
            }
            double res = 1;
            if (n < 0) {
                for (int i = n; i < 0; i++) {
                    res /= x;
                }
            }
            else {
                for (int i = 0; i < n; i++) {
                    res *= x;
                }
            }
            System.out.println(res);
            return res;
    }
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double res = myPow(x,n/2);
        if (res > Double.MAX_VALUE) {
            System.out.println("ej");
            return 0.0;
        }
        return n % 2 == 0 ? res*res : x*res*res;
    }
}
