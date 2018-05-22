package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * created by zsj in 16:45 2018/5/22
 * description:给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。
 * S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 **/
public class Lee771 {

    public static void main(String[] args) {

    }

    public int numJewelsInStones(String J, String S) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < J.length(); i++) {
            map.put(J.charAt(i),0);
        }
        int sum = 0;
        for (int i = 0; i < S.length(); i++) {
            if (map.containsKey(S.charAt(i))) {
                sum++;
            }
        }
        return sum;

    }
}
