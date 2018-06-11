package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * created by zsj in 11:21 2018/6/11
 * description:给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。
 * 例如，"cab" 可以写成 "-.-.-....-"，(即 "-.-." + "-..." + ".-"字符串的结合)。我们将这样一个连接过程称作单词翻译。
 * 返回我们可以获得所有词不同单词翻译的数量。
 **/
public class Lee804 {
    public static void main(String[] args) {
        Lee804 lee804 = new Lee804();
        lee804.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"});
    }
    public int uniqueMorseRepresentations(String[] words) {
        String[] strs = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        System.out.println(strs.length);
        Set<String> set = new HashSet<>();
        for (String tmp : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < tmp.length(); i++) {
                sb.append(strs[tmp.charAt(i)-'a']);
            }
            set.add(sb.toString());
        }
        System.out.println(set.size());
        return set.size();
    }
}
