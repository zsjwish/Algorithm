package leetcode;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * created by zsj in 13:09 2019/8/17
 * description:
 **/
public class Lee833 {
    public static String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        int length = indexes.length;
        TreeMap<Integer, String[]> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < length; i++) {
            map.put(indexes[i], new String[]{sources[i], targets[i]});
        }
        StringBuffer sb = new StringBuffer(S);
        for (int index : map.keySet()) {
            String sourceStr = map.get(index)[0];
            String targetStr = map.get(index)[1];
            int sourceLength = sourceStr.length();
            if (S.substring(index, index + sourceLength).equals(sourceStr)) {
                sb.replace(index, index + sourceLength, targetStr);
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        findReplaceString("abcd", new int[]{0,2}, new String[]{"a","cd"}, new String[]{"eee","ffff"});
        findReplaceString("abcd", new int[]{0,2}, new String[]{"a","cd"}, new String[]{"eee","ffff"});
        findReplaceString("abcd", new int[]{0,2}, new String[]{"ab","ec"}, new String[]{"eee","ffff"});
    }
}
