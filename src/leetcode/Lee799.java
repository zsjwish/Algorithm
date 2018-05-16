package leetcode;

/**
 * created by zsj in 14:00 2018/5/16
 * description:
 * 我们把玻璃杯摆成金字塔的形状，其中第一层有1个玻璃杯，第二层有2个，依次类推到第100层，每个玻璃杯(250ml)将盛有香槟。
 * 从顶层的第一个玻璃杯开始倾倒一些香槟，当顶层的杯子满了，任何溢出的香槟都会立刻等流量的流向左右两侧的玻璃杯。
 * 当左右两边的杯子也满了，就会等流量的流向它们左右两边的杯子，依次类推。（当最底层的玻璃杯满了，香槟会流到地板上）
 * 例如，在倾倒一杯香槟后，最顶层的玻璃杯满了。倾倒了两杯香槟后，第二层的两个玻璃杯各自盛放一半的香槟。
 * 在倒三杯香槟后，第二层的香槟满了 - 此时总共有三个满的玻璃杯。
 * 在倒第四杯后，第三层中间的玻璃杯盛放了一半的香槟，他两边的玻璃杯各自盛放了四分之一的香槟.
 **/
public class Lee799 {

    public static void main(String[] args) {
        Lee799 lee799 = new Lee799();
        System.out.println(lee799.champagneTower(4,2,1));
    }


    public double champagneTower1(int poured, int query_row, int query_glass) {
        int i = 1;
        while (i <= query_row) {
            poured -= i++;
        }
//        return poured >= query_row+1 ? 1 : poured <= 0 ? 0 : (double)poured / (2*(query_row-1)+2);
        if (poured >= query_row + 1)
            return 1;
        if (poured <= 0) {
            return 0;
        }
        if (query_glass == 0 || query_glass == query_row) {
            return (double)poured / (2*(query_row-1) + 2);
        }
        return 2 * (double)poured / (2*(query_row-1) + 2);
    }

    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] res = new double[100][100];
        res[0][0] = poured;
        for (int i = 0; i < query_row; i++) {
            for (int j = 0; j <= i; j++) {
                double q = (res[i][j] - 1) / 2;
                if (q > 0) {
                    res[i+1][j] += q;
                    res[i+1][j+1] += q;
                }
            }
        }
        return Math.min(1,res[query_row][query_glass]);
    }
}
