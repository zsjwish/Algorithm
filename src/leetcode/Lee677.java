package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * created by zsj in 9:58 2018/5/8
 * description:
 **/
public class Lee677 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("zs",2);
        map.put("zs",4);
        map.put("zs",6);
        System.out.println(map);

    }


    private Map<String, Integer> map;
    public Lee677() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key, val);
    }

    public int sum(String prefix) {
        int res = 0;
        for (String key: map.keySet()) {
            if (key.startsWith(prefix)) {
                res += map.get(key);
            }

        }
        return res;
    }
}

