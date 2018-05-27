package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * created by zsj in 14:09 2018/5/27
 * description:设计一个支持在平均 时间复杂度 O(1) 下， 执行以下操作的数据结构。
 * 注意: 允许出现重复元素。
 * insert(val)：向集合中插入元素 val。
 * remove(val)：当 val 存在时，从集合中移除一个 val。
 * getRandom：从现有集合中随机获取一个元素。每个元素被返回的概率应该与其在集合中的数量呈线性相关。
 **/
public class Lee381 {
    public static void main(String[] args) {
        Lee381 lee381 = new Lee381();
        lee381.insert(-1);
        lee381.insert(-2);
        System.out.println(lee381.list);
        lee381.remove(-2);
        System.out.println(lee381.list);
        lee381.insert(-2);
        lee381.getRandom();
        lee381.remove(-1);
        System.out.println(lee381.list);
        lee381.insert(-2);
        lee381.getRandom();
        System.out.println(lee381.list);


    }
    private List<Integer> list;
    /** Initialize your data structure here. */
    public Lee381() {
        list = new LinkedList<>();
    }

    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        return list.add(val);
    }

    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if (list.contains(val)) {
            int index = list.indexOf(val);
            list.remove(index);
            return true;
        }
        return false;
    }

    /** Get a random element from the collection. */
    public int getRandom() {
        Random random = new Random();
        int rand = random.nextInt()%list.size();
        System.out.println(list.get(rand));
        return list.get(rand);
    }
}
