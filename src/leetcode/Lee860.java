package leetcode;

/**
 * created by zsj in 10:06 2018/9/25
 * description:在柠檬水摊上，每一杯柠檬水的售价为 5 美元。
 * 顾客排队购买你的产品，（按账单 bills 支付的顺序）一次购买一杯。
 * 每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。
 * 你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 5 美元。
 * 注意，一开始你手头没有任何零钱。
 * 如果你能给每位顾客正确找零，返回 true ，否则返回 false 。
 **/
public class Lee860 {
    public static void main(String[] args) {

    }
    public static boolean lemonadeChange(int[] bills) {
        int[] bill = new int[3];
        for (int b : bills) {
            if (5 == b) {
                bill[0]++;
                continue;
            }
            else if (10 == b) {
                if (bill[0] >= 1) {
                    bill[0]--;
                    bill[1]++;
                    continue;
                }
                return false;
            }
            else if (20 == b) {
                if (bill[1] >= 1 && bill[0] >= 1) {
                    bill[0]--;
                    bill[1]--;
                    bill[2]++;
                    continue;
                }
                else if (bill[0] >= 3) {
                    bill[0] -= 3;
                    bill[2]++;
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}
