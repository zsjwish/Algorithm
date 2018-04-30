package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 16:00 2018/4/30
 * description:
 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。对每个孩子 i ，都有一个胃口值 gi ，
 这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j ，都有一个尺寸 sj 。
 如果 sj >= gi ，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。
 你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
 **/
public class Lee455 {

    public static void main(String[] args) {
        int[] g = new int[] {1,2};
        int[] s = new int[] {1,2,3};
        Lee455 lee455 = new Lee455();
        lee455.findContentChildren(g, s);
    }
    //g是孩子们的胃口，s是饼干尺寸
    public int findContentChildren(int[] g, int[] s) {
        if (g == null || s == null || s.length == 0 || g.length == 0) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int gNumber = 0;
        int sNumber = 0;
        int sum = 0;
        while (gNumber < g.length && sNumber < s.length) {
            if (s[sNumber] >= g[gNumber]) {
                sNumber++;
                gNumber++;
                sum++;
            }
            else {
                sNumber++;
            }
        }
        System.out.println(sum);
        return sum;
    }

}
