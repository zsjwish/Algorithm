package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 17:18 2018/6/11
 * description:
 **/
public class Lee821 {
    public static void main(String[] args) {
        Lee821 lee821 = new Lee821();
        lee821.shortestToChar("loveleetcode",'e');
    }
    public int[] shortestToChar(String S, char C) {
        if (!S.contains(C+"")) {
            return null;
        }
        int[] res = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            res[i] = getShortChar(S,C,i);
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
    public int getShortChar(String S, char C, int cur) {
        int low = 0, high = S.length()-1, tmpl = cur, tmph = cur;
        while (tmpl>=low && high>= tmpl || tmph>=low && high>= tmph) {
            if ((tmpl>=low && S.charAt(tmpl) == C) || (tmph<=high && S.charAt(tmph) == C)) {
                return Math.min(cur-tmpl, tmph-cur);
            }
            tmpl--;
            tmph++;
        }
        return Integer.MAX_VALUE;
    }
}
