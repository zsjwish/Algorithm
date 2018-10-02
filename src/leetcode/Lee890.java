package leetcode;

import java.util.*;

/**
 * created by zsj in 14:57 2018/10/2
 * description:
 * 你有一个单词列表 words 和一个模式  pattern，你想知道 words 中的哪些单词与模式匹配。
 * 如果存在字母的排列 p ，使得将模式中的每个字母 x 替换为 p(x) 之后，我们就得到了所需的单词，那么单词与模式是匹配的。
 * （回想一下，字母的排列是从字母到字母的双射：每个字母映射到另一个字母，没有两个字母映射到同一个字母。）
 * 返回 words 中与给定模式匹配的单词列表。
 * 你可以按任何顺序返回答案。
 **/
public class Lee890 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getStrPos("abbcdd")));
        System.out.println(findAndReplacePattern(new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"},"abb"));
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        int[] pat = getStrPos(pattern);
        List<String> res = new LinkedList<>();
        for (String tmp : words) {
            if (Arrays.equals(pat, getStrPos(tmp))) {
                res.add(tmp);
            }
        }
        return res;
    }

    public static int[] getStrPos(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        int[] res = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], i);
            }
            res[i] = map.get(chars[i]);
        }
        return res;
    }
}
