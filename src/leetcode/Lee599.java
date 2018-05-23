package leetcode;

import java.util.*;

/**
 * created by zsj in 11:20 2018/5/23
 * description:
 * 假设Andy和Doris想在晚餐时选择一家餐厅，并且他们都有一个表示最喜爱餐厅的列表，每个餐厅的名字用字符串表示。
 * 你需要帮助他们用最少的索引和找出他们共同喜爱的餐厅。 如果答案不止一个，则输出所有答案并且不考虑顺序。
 * 你可以假设总是存在一个答案。
 **/
public class Lee599 {

    public static void main(String[] args) {
        String[] list1 = new String[]{"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = new String[]{"KFC","Burger King","Tapioca Express","Shogun"};
        Lee599 lee599 = new Lee599();
        lee599.findRestaurant(list1, list2);
    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new LinkedList<>();
        int resIndex = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                if (map.get(list2[i]) + i < resIndex) {
                    resIndex = map.get(list2[i]) + i;
                    list.removeAll(list);
                    list.add(list2[i]);
                }
                else if (map.get(list2[i]) + i == resIndex) {
                    list.add(list2[i]);
                }
            }
        }
        String[] resStr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            resStr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(resStr));
        return resStr;
    }

}
