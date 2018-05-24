package leetcode;

/**
 * created by zsj in 10:45 2018/5/24
 * description:我们称一个数 X 为好数, 如果它的每位数字逐个地被旋转 180 度后，我们仍可以得到一个有效的，且和 X 不同的数。
 * 要求每位数字都要被旋转。
 * 如果一个数的每位数字被旋转以后仍然还是一个数字， 则这个数是有效的。0, 1, 和 8 被旋转后仍然是它们自己；
 * 2 和 5 可以互相旋转成对方；6 和 9 同理，除了这些以外其他的数字旋转以后都不再是有效的数字。
 * 现在我们有一个正整数 N, 计算从 1 到 N 中有多少个数 X 是好数？
 **/
public class Lee788 {

    public static void main(String[] args) {

    }

    public int rotatedDigits(int N) {
        int res = 0;
        for (int i = 2; i <= N; i++) {
            if (containsRight(i) && containsSome(i)) {
                res++;
            }
        }
        return res;
    }

    /**
     * 判断是否只包含0,1,2,5,6,8,9,
     * @param n
     * @return
     */
    public boolean containsRight(int n) {
        String tmp = n + "";
        for (int i = 0; i < tmp.length(); i++) {
            char ch = tmp.charAt(i);
            if (ch=='0' || ch=='1' || ch=='2' || ch=='5' || ch=='6'|| ch =='8' || ch=='9') {
                continue;
            }
            return false;
        }
        return true;
    }

    /**
     * 判断是否包含2,5,6,9使旋转后不一样
     */
    public boolean containsSome(int n) {
        String tmp = n + "";
        for (int i = 0; i < tmp.length(); i++) {
            char ch = tmp.charAt(i);
            if (ch=='2' || ch=='5' || ch=='6' || ch=='9') {
                return true;
            }
        }
        return false;
    }

}
