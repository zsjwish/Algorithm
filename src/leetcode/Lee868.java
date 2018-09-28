package leetcode;

/**
 * created by zsj in 17:39 2018/9/27
 * description:
 * 给定一个正整数 N，找到并返回 N 的二进制表示中两个连续的 1 之间的最长距离。
 * 如果没有两个连续的 1，返回 0 。
 **/
public class Lee868 {
    public static void main(String[] args) {
        System.out.println(binaryGap(22));
        System.out.println(binaryGap(5));
        System.out.println(binaryGap(6));
        System.out.println(binaryGap(8));
    }

    public static int binaryGap(int N) {
        int max = 0;
        String s = Integer.toBinaryString(N);
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    max = Math.max(max, j-i);
                    break;
                }
            }
        }
        return max;
    }
}
