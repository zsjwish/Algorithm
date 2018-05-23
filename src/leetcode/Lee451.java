package leetcode;

import java.util.*;

/**
 * created by zsj in 13:51 2018/5/23
 * description:给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
 **/
public class Lee451 {
    public static void main(String[] args) {
        Lee451 lee451 = new Lee451();
        lee451.frequencySort1("zzzzxaacccasd1111123");
    }

    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) +1);
            }
            else {
                map.put(ch, 1);
            }
        }
        List<Map.Entry<Character,Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character,Integer> tmp : list) {
            int length = tmp.getValue();
            char chTmp = tmp.getKey();
            for (int i = 0; i < length; i++) {
                sb.append(chTmp);
            }
        }
        return sb.toString();
    }

    //treeMap是根据key来排序的
    public String frequencySort1(String s) {
        Map<Character, Integer> map = new TreeMap<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
            }
            else {
                map.put(s.charAt(i), 1);
            }
        }
        System.out.println(map);
        return null;

    }
}
