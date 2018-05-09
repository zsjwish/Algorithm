package sort;

import java.util.*;

/**
 * created by zsj in 12:50 2018/5/9
 * description:对数组中数字排序，按数字出现的次数排序，出现次数多的排在前面，出现次数少的排在后面
 * 例如[1,2,3,4,4,4,2,2,1] 则排序后是[2,2,2,4,4,4,1,1,3]
 **/
public class SortByCount {

    public static void main(String[] args) {
        SortByCount sortByCount = new SortByCount();
        sortByCount.sortByCount(new int[] {1,2,3,4,4,4,2,2,1});
    }

    public int[] sortByCount(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int tmp : nums) {
            if (map.containsKey(tmp)) {
                map.put(tmp, map.get(tmp) + 1);
            }
            else {
                map.put(tmp, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>();
        list.addAll(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
                }
        });
        System.out.println(list);
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            for (int j = 0; j < entry.getValue(); j++) {
                nums[i++] = entry.getKey();
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

}
