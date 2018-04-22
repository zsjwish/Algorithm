package leetcode;

/**
 * created by zsj in 15:21 2018/4/20
 * description:一个数组，输入i,j.输出数组第i个数到第j个数的和。使用dp。遇到的问题！！对数组dp的时候放在类构造函数中，
 * 因为这样就只会dp一次，如果放在sunRange函数中每次调用的时候就会dp一次会造成错误。dp即第i个数是前一个数加上当前数，
 * 即数组中第i个数存放0-i数的和，然后用num[j] - num[i-1]就是结果，如果i==0,则返回num[j]
 * **/
public class Lee303 {

    public static void main(String[] args) {
        Lee303 lee303 = new Lee303(new int[]{-2, 0, 3, -5, 2, -1});
        lee303.sumRange(2,5);
        lee303.sumRange(0,5);
    }

    private int[] data;

    public Lee303(int[] nums) {
        this.data = nums;
        int length = data.length;
        for (int i = 1; i < length; i++) {
            data[i] += data[i-1];
        }
    }

    public int sumRange(int i, int j) {
        if (i > j) {
            return 0;
        }
        int[] res = data;
        int length = res.length;
        if (j > length && i < 0) {
            return 0;
        }
        if (i == 0) {
            System.out.println(res[j]);
            return res[j];
        }
        else {
            System.out.println(res[j] - res[i-1]);
            return res[j] - res[i-1];
        }
    }
}
