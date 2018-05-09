package leetcode;

import java.util.*;

/**
 * created by zsj in 11:17 2018/5/9
 * description:给定一个字符串S，检查是否能重新排布其中的字母，使得两相邻的字符不同。
 * 若可行，输出任意可行的结果。若不可行，返回空字符串。
 * 注意：只包含小写字符
 **/
public class Lee767 {

    public static void main(String[] args) {
        Lee767 lee767 = new Lee767();
        lee767.reorganizeString("asdfdfcxsdsds");
        lee767.sortByCount("asdfdfcxsdsds".toCharArray());
    }

    public String reorganizeString(String S) {
        if (S == null || S.length() <= 1) {
            return S;
        }
        int length = S.length();
        int max = Integer.MIN_VALUE;
        int[] res = new int[26];
        for (int i = 0; i < length; i++) {
            int tmp = S.charAt(i) - 'a';
            res[tmp]++;
            if (res[tmp] > max) {
                max = res[tmp];
            }
        }
        if (max > (1 + length) / 2) {
            return "";
        }
        char[] chars = S.toCharArray();
        sortByCount(chars);
        int j = 0;
        StringBuilder sb = new StringBuilder(S);
        for (int i = 0; i < length; i = i+2) {
            sb.setCharAt(i, chars[j++]);
        }
        for (int i = 1; i < length; i = i+2) {
            sb.setCharAt(i, chars[j++]);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public char[] sortByCount(char[] nums) {
        Map<Character, Integer> map = new HashMap<>();
        for (char tmp : nums) {
            if (map.containsKey(tmp)) {
                map.put(tmp, map.get(tmp) + 1);
            }
            else {
                map.put(tmp, 1);
            }
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>();
        list.addAll(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        int i = 0;
        for (Map.Entry<Character, Integer> entry : list) {
            for (int j = 0; j < entry.getValue(); j++) {
                nums[i++] = entry.getKey();
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

}
