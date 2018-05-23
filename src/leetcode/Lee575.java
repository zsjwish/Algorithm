package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * created by zsj in 10:29 2018/5/23
 * description:
 给定一个偶数长度的数组，其中不同的数字代表着不同种类的糖果，每一个数字代表一个糖果。
 你需要把这些糖果平均分给一个弟弟和一个妹妹。返回妹妹可以获得的最大糖果的种类数。
 **/
public class Lee575 {

    public static void main(String[] args) {

    }
    public int distributeCandies1(int[] candies) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int tmp : candies) {
            if (!map.containsKey(tmp)) {
                map.put(tmp, 1);
            }
            else {
                map.put(tmp,map.get(tmp) + 1);
            }
        }
        return Math.min(map.size(), candies.length / 2);
    }
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int tmp : candies) {
            set.add(tmp);
        }
        return Math.min(set.size(),candies.length / 2);
    }
}
