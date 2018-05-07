package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 10:25 2018/5/7
 * description:给定一组字符，使用原地算法将其压缩。
 * 压缩后的长度必须始终小于或等于原数组长度。
 * 数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
 * 在完成原地修改输入数组后，返回数组的新长度。
 * 输入：
 * ["a","a","b","b","c","c","c"]
 * 输出：
 * 返回6，输入数组的前6个字符应该是：["a","2","b","2","c","3"]
 * 说明：
 * "aa"被"a2"替代。"bb"被"b2"替代。"ccc"被"c3"替代。
 **/
public class Lee443 {

    public static void main(String[] args) {
        Lee443 lee443 = new Lee443();
//        lee443.compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'});
        lee443.compress(new char[]{'a','a','b','b','c','c','c'});
    }

    public int compress(char[] chars) {
        if (chars == null || chars.length == 0) {
            return 0;
        }
        int low = 0, high = chars.length;
        StringBuffer sb = new StringBuffer();
        while (low < high) {
            char tmp = chars[low];
            int count = 1;
            for (int i = low + 1; i < high; i++) {
                if (chars[i] == chars[i-1]) {
                    count++;
                }
                else {
                    break;
                }
            }
            sb.append(tmp);
            low += count;
            if (count != 1) {
                sb.append(count);
            }
        }
        chars = sb.toString().toCharArray();
        System.out.println(Arrays.toString(chars));
        System.out.println(sb.toString());
        return sb.length();
    }
}
