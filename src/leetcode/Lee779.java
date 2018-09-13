package leetcode;

/**
 * created by zsj in 22:34 2018/9/13
 * description:在第一行我们写上一个 0。接下来的每一行，将前一行中的0替换为01，1替换为10。
 * 给定行数 N 和序数 K，返回第 N 行中第 K个字符。（K从1开始）
 **/
public class Lee779 {
    public static void main(String[] args) {
//        kthGrammar(1,1);
//        kthGrammar(2,1);
//        kthGrammar(2,2);
        kthGrammar(4,5);
    }

    private static int kthGrammar(int N, int K) {
        return N == 1 ? 0 : kthGrammar(N-1, (K+1) / 2) ^ (K+1) % 2;
    }

    public static int kthGrammar1(int N, int K) {
        StringBuffer s1 = new StringBuffer("0");
        if (N == 1 || K == 1) {
            return 0;
        }
        for (int i = 2; i <= N; i++) {
            StringBuffer sb = new StringBuffer();
            for (char c : s1.toString().toCharArray()) {
                if (c == '0') {
                    sb.append("01");
                }
                else {
                    sb.append("10");
                }
                s1 = sb;
            }
        }
        return s1.toString().charAt(K-1) - '0';
    }
}
