package recode;

/**
 * created by zsj in 17:09 2018/5/11
 * description:给定一个数字，找出这个数字的阶乘的末尾的0的个数
 * 思路：有一个5就有一个0，但是25相当于两个5，所以有两个0.递归到25以下然后计算5的个数就是0可以出现的个数了。
 **/
public class JieChengzeroNum {

    public static void main(String[] args) {
        JieChengzeroNum jczn = new JieChengzeroNum();
        System.out.println(25*30);
        System.out.println(jczn.getZeroNum(30));
    }

    public int getZeroNum(int k) {
        if (k / 5 < 1) {
            return 0;
        }
        return k / 5 + getZeroNum(k / 5);
    }

    public long getJieCheng(long k) {
        if (k == 1 || k == 0) {
            return 1;
        }
        return k * getJieCheng(k-1);
    }

    public long getParJieCheng(long start, long end) {
        long res = start;
        while (start < end) {
            res *= ++ start;
        }
        System.out.println(res);
        return res;
    }

}
