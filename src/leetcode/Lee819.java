package leetcode;

import java.util.*;

/**
 * created by zsj in 12:00 2018/5/24
 * description:给定一个段落 (paragraph) 和一个禁用单词列表 (banned)。返回出现次数最多，同时不在禁用列表中的单词。
 * 题目保证至少有一个词不在禁用列表中，而且答案唯一。
 * 禁用列表中的单词用小写字母表示，不含标点符号。段落中的单词不区分大小写。答案都是小写字母。
 * 1 <= 段落长度 <= 1000.
 * 1 <= 禁用单词个数 <= 100.
 * 1 <= 禁用单词长度 <= 10.
 * 答案是唯一的, 且都是小写字母 (即使在 paragraph 里是大写的，即使是一些特定的名词，答案都是小写的。)
 * paragraph 只包含字母、空格和下列标点符号!?',;.
 * paragraph 里单词之间都由空格隔开。
 * 不存在没有连字符或者带有连字符的单词。
 * 单词里只包含字母，不会出现省略号或者其他标点符号。
 **/
public class Lee819 {

    public static void main(String[] args) {
        String s = "Bob. hIt, baLl";
        String[] res = s.split("[?!,;' .]");
        Lee819 lee819 = new Lee819();
        System.out.println(lee819.mostCommonWord(s, new String[]{"bob", "hit"}));
    }

    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        String[] res = paragraph.split("[?!,;' .]");
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (String tmp : banned) {
            set.add(tmp);
        }
        for (String tmp : res) {
            if (!set.contains(tmp) && !tmp.isEmpty()) {
                if (map.containsKey(tmp)) {
                    map.put(tmp, map.get(tmp) + 1);
                } else {
                    map.put(tmp, 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> list = new LinkedList<>();
        for (Map.Entry<String, Integer> tmp : map.entrySet()) {
            list.add(tmp);
        }
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        return list.get(0).getKey();
    }

}
