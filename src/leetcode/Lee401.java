package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * created by zsj in 14:15 2018/5/5
 * description:二进制手表顶部有 4 个 LED 代表小时（0-11），底部的 6 个 LED 代表分钟（0-59）。
 * 每个 LED 代表一个 0 或 1，最低位在右侧。
 **/
public class Lee401 {

    public static void main(String[] args) {

    }
    public List<String> readBinaryWatch(int num) {
        List<String> res = new LinkedList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
               if(Integer.bitCount(i) + Integer.bitCount(j) == num) {
                   res.add(String.format("%d:%2d", i, j));
               }
            }
        }
        return res;
    }

}
