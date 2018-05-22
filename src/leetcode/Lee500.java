package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * created by zsj in 17:07 2018/5/22
 * description:给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。
 * 你可以重复使用键盘上同一字符。
 * 你可以假设输入的字符串将只包含字母
 **/
public class Lee500 {

    public static void main(String[] args) {
        String[] strings = new String[]{"Hello","Alaska","Dad","Peace"};
        Lee500 lee500 = new Lee500();
        lee500.findWords(strings);
    }

    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";

        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        Map<Character,Integer> map3 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i),0);
        }
        for (int i = 0; i < s2.length(); i++) {
            map2.put(s2.charAt(i),0);
        }
        for (int i = 0; i < s3.length(); i++) {
            map3.put(s3.charAt(i),0);
        }
        boolean b1 = true, b2 = true, b3 = true;
        int index = 0;
        String[] res = new String[words.length];

        for (String s : words) {
            String tmp = s.toLowerCase();
            b1 = true;
            b2 = true;
            b3 = true;
            for (int i = 0; i < tmp.length(); i++) {
                Character c = tmp.charAt(i);
                if (!map1.containsKey(c)) b1 = false;
                if (!map2.containsKey(c)) b2 = false;
                if (!map3.containsKey(c)) b3 = false;
            }
            if (b1 || b2 || b3) {
                res[index++] = s;
            }
        }
        String[] res2 = new String[index];
        for (int i = 0; i < index; i++) {
            res2[i] = res[i];
        }
        System.out.println(Arrays.toString(res2));
        return res2;
    }

}
