package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 0:17 2018/9/9
 * description:给定一个32位正整数 n，你需要找到最小的32位整数，其与 n 中存在的位数完全相同，并且其值大于n。如果不存在这样的32位整数，则返回-1。
 **/
public class Lee556 {
    public static void main(String[] args) {
        System.out.println(nextGreaterElement(230241));
    }

    public static int nextGreaterElement(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int high = chars.length - 1;
        for (int i = high-1; i >= 0; i--) {
            int base = Integer.valueOf(chars[i]);
            int big = Integer.MAX_VALUE;
            int z = -1;
            for (int j = i+1; j <= high; j++) {
                int tmp = Integer.valueOf(chars[j]);
                if (tmp> base && tmp<= big) {
                    big = tmp;
                    z = j;
                }
            }
            if (big < Integer.MAX_VALUE && big > base && z!=-1) {
                char tmp = chars[i];
                chars[i] = chars[z];
                chars[z] = tmp;
                Arrays.sort(chars, i+1, chars.length);
                try {
                    return Integer.valueOf(new String(chars));
                }catch (NumberFormatException e) {
                    return -1;
                }
            }
        }
        return -1;
    }
}
