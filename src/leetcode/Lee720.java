package leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * created by zsj in 11:41 2018/5/23
 * description:给出一个字符串数组words组成的一本英语词典。
 * 从中找出最长的一个单词，该单词是由words词典中其他单词逐步添加一个字母组成。
 * 若其中有多个可行的答案，则返回答案中字典序最小的单词。
 * 若无答案，则返回空字符串。
 * words = ["w","wo","wor","worl", "world"]
 * 输出: "world"
 * 解释:
 * 单词"world"可由"w", "wo", "wor", 和 "worl"添加一个字母组成。
 **/
public class Lee720 {
    public static void main(String[] args) {
        Lee720 lee720 = new Lee720();
        System.out.println(lee720.longestWord(new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"}));
        System.out.println(lee720.longestWord(new String[]{"w","wo","wor","worl", "world"}));
    }

    public String longestWord(String[] words) {
        List<String> list = new LinkedList<>();
        for (String tmp : words) {
            list.add(tmp);
        }
        System.out.println(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }
                else {
                    return o1.compareTo(o2);
                }
            }
        });
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            String tmp = list.get(i);
            int j = 1;
            for ( ; j < tmp.length(); j++) {
                if (!list.contains(tmp.substring(0,j))) {
                    break;
                }
            }
            if (j == tmp.length()) {
                return tmp;
            }
        }
        return "";
    }
}
