package leetcode;

/**
 * created by zsj in 23:45 2018/9/12
 * description:给定表示初始状态的字符串 "S" 。如果第 i 张多米诺骨牌被推向左边，则 S[i] = 'L'；
 * 如果第 i 张多米诺骨牌被推向右边，则 S[i] = 'R'；如果第 i 张多米诺骨牌没有被推动，则 S[i] = '.'。
 * 返回表示最终状态的字符串。
 **/
public class Lee838 {
    public static void main(String[] args) {
        System.out.println(pushDominoes(".L.R...LR..L.."));
        System.out.println(pushDominoes("RR.L"));
        System.out.println(pushDominoes("."));

    }

    public static String pushDominoes(String dominoes) {
        if (dominoes == null || dominoes.length() == 1) {
            return dominoes;
        }
        StringBuffer sb = new StringBuffer(dominoes);
        while (true) {
            StringBuffer sb1 = new StringBuffer(sb);
            int length = sb.length();
            for (int i = 0; i < length; i++) {
                if (sb.charAt(i)=='.') {
                    if (i == 0) {
                        if (sb.charAt(i+1) == 'L') {
                            sb1.setCharAt(i, 'L');
                        }
                    }
                    else if (i == length-1) {
                        if (sb.charAt(i-1) == 'R') {
                            sb1.setCharAt(i, 'R');
                        }
                    }
                    else {
                        if (sb.charAt(i-1) == 'R' && sb.charAt(i+1) !='L') {
                            sb1.setCharAt(i, 'R');
                        }
                        else if (sb.charAt(i+1) == 'L' && sb.charAt(i-1)!='R') {
                            sb1.setCharAt(i, 'L');
                        }
                    }
                }
            }
            if (sb.toString().equals(sb1.toString())) {
                return sb.toString();
            }
            else {
                sb = sb1;
            }
        }
    }
}
