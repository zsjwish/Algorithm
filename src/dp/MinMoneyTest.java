package dp;

/**
 * created by zsj in 22:42 2018/9/3
 * description:
 **/
public class MinMoneyTest {
    public static void main(String[] args) {
        int[] nums = new int[] {2,3,5};
        System.out.println(getRes(nums, 22));
    }
    public static int getRes(int[] money, int total) {
        int min = Integer.MAX_VALUE;
        for (int m : money) {
            min = Math.min(min, m);
            if (m == total) {
                return 1;
            }
        }
        if (min > total) {
            return 999999;
        }
        else {
            int resMin = Integer.MAX_VALUE;
            for (int i = 0; i < money.length; i++) {
                resMin = Math.min(resMin, 1+getRes(money, total - money[i]));
            }
            return resMin;
        }
    }
}
