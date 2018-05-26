package leetcode;

/**
 * created by zsj in 19:49 2018/5/26
 * description:统计所有小于非负数整数 n 的质数的数量
 **/
public class Lee204 {
    public static void main(String[] args) {
        Lee204 lee204 = new Lee204();
        System.out.println(lee204.countPrimes(10));
    }
    public int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 3) {
            return 1;
        }
        int res = 1;
        for (int i = 3; i < n; i=i+2) {
            if (!idPrimes(i)) {
                res++;
            }
        }
        return res;
    }

    public Boolean idPrimes(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }

    public int countPrimes1(int n) {
        boolean[] booleans = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (booleans[i] == false){
                count++;
            }
            for (int j = 2; i * j < n; j++) {
                booleans[i*j] = true;
            }
        }
        return count;
    }
}
