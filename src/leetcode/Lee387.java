package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * created by zsj in 10:52 2018/5/5
 * description:给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 思路：map
 **/
public class Lee387 {

    public static void main(String[] args) {

    }

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (map.containsKey(tmp)) {
                map.put(tmp, map.get(tmp) + 1);
            }
            else {
                map.put(tmp, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (map.get(tmp) == 1) {
                return i;
            }
        }
        return -1;
    }


}
