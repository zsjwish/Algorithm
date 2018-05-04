package leetcode;

/**
 * created by zsj in 11:16 2018/5/4
 * description:
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * 解释：汉明距离是两个字符串对应位置上不同字符的个数，
 * 换句话说，汉明距离就是将一个字符串替换成另外一个字符串所需要替换的字符长度。
 * 思路：相同的就不用替换了，不同的需要替换一次，所以用异或^ ，相同为0，不同为1，异或后获取1的个数就是要求的汉明距离
 **/
public class Lee461 {

    public static void main(String[] args) {
        int[] s = new int[]{1,2,3};
        System.out.println(s.length);
    }

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}
