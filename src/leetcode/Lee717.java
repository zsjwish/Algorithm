package leetcode;

/**
 * created by zsj in 13:05 2018/4/30
 * description:有两种特殊字符。第一种字符可以用一比特0来表示。第二种字符可以用两比特(10 或 11)来表示。
 * 现给一个由若干比特组成的字符串。问最后一个字符是否必定为一个一比特字符。给定的字符串总是由0结束。
 * 思路：从钱往后遍历。遇到0加一位，遇到1 加两位，因为这一位不用判断。到最后一位看i是否已经到达最后一位。
 * 思路2：每次判断连续两位的值，如果不是01就加2，是01返回false。直到最后两位。
 **/
public class Lee717 {

    public static void main(String[] args) {
        int[] bits = new int[] {1,1,1,1,0};
        Lee717 lee717 = new Lee717();
        lee717.isOneBitCharacter(bits);
    }

    private boolean isOneBitCharacter(int[] bits) {
        if (bits == null || bits.length == 0) {
            return false;
        }
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length-1;
    }

    public boolean isOneBitCharacter1(int[] bits) {
        if (bits == null || bits.length == 0) {
            return false;
        }
        if (bits.length == 1 & bits[0] == 0) {
            return true;
        }
        int low = 0;
        String tmp;
        while (low < bits.length-2) {
            tmp = "";
            tmp = tmp + bits[low] + bits[low + 1];
            if (tmp.equals("01")) {
                low++;
            }
            else {
                low = low + 2;
            }
        }
        if (low == bits.length - 2) {
            tmp = "";
            tmp = tmp + bits[low] + bits[low + 1];
            if (tmp.equals("00")) {
                System.out.println("true");
                return true;
            }
            System.out.println(false);
            return false;
        }
        else if (low == bits.length - 1) {
            if (bits[low] == 0) {
                System.out.println(true);
                return true;
            }
            System.out.println(false);
            return false;
        }
        System.out.println("false s s ");
        return false;
    }
}
