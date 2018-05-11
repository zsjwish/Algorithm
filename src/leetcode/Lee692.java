package leetcode;

import java.util.*;

/**
 * created by zsj in 14:59 2018/5/11
 * description:给一非空的单词列表，返回前 k 个出现次数最多的单词。
 * 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序
 **/
public class Lee692 {

    public static void main(String[] args) {
        String[] strings = new String[] {"i", "love", "leetcode", "i", "love", "coding"};
        Lee692 lee692 = new Lee692();
        lee692.topKFrequent(strings, 3);
    }
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String tmp : words) {
            if (map.containsKey(tmp)) {
                map.put(tmp, map.get(tmp) + 1);
            }
            else {
                map.put(tmp, 1);
            }
        }
        List<String> mapsort = new ArrayList<>(map.keySet());
        Collections.sort(mapsort, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o1).equals(map.get(o2)) ? o1.compareTo(o2) : map.get(o2) - map.get(o1);
            }
        });
        System.out.println(mapsort);
        List<String> res = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            res.add(mapsort.get(i));
        }
        System.out.println(res);
        return res;
    }
}
