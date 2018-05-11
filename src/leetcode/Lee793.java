package leetcode;

/**
 * created by zsj in 17:37 2018/5/11
 * description:f(x) 是 x! 末尾是0的数量。（回想一下 x! = 1 * 2 * 3 * ... * x，且0! = 1）
 * 例如， f(3) = 0 ，因为3! = 6的末尾没有0；而 f(11) = 2 ，因为11!= 39916800末端有2个0。
 * 给定 K，找出多少个非负整数x ，有 f(x) = K 的性质。
 **/

//--------------------------没写完
public class Lee793 {

    public static void main(String[] args) {
        Lee793 lee793 = new Lee793();
        lee793.preimageSizeFZF(69516713);
    }

    private int preimageSizeFZF(int K) {
        int res = 0;
        int aim = 5*K;
        while (getK(aim) > K) {
            aim -= 5;
        }
        for (int i = aim-1; i >= aim - 5 && aim - 5 >= 0; i--) {
            if (i >= 0 && getK(i) == K) {
                System.out.println(i);
                res++;
            }
        }
        for (int i = aim; i < aim + 5; i++) {
            if (getK(i) == K) {
                System.out.println(i);
                res++;
            }
        }
        System.out.println(res);
        return res;
    }
    //获取某个数阶乘末尾为0 的个数
    public int getK(int k) {
        if (k / 5 <= 0) {
            return 0;
        }
        return k / 5 + getK(k / 5);
    }
    public int preimageSizeFZF1(int K) {
        int[] res = new int[15464691];
        for (int i = 0; i < res.length; i++) {
            res[i] = getK(i);
        }
        int resNum = 0;
        for (int i = 0; i < res.length; i++) {
            if (res[i] == K) {
                resNum++;
            }
        }
        System.out.println(resNum);
        return resNum;
    }


}
