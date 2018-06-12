package leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * created by zsj in 20:22 2018/6/11
 * description:
 **/
public class Lee386 {
    public static void main(String[] args) {
        Lee386 lee386 = new Lee386();
        lee386.lexicalOrder(13);
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            res.add(i);
        }
        Collections.sort(res, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1+"";
                String s2 = o2+"";
                return s1.compareTo(s2);
            }
        });
        System.out.println(res);
        return res;
    }

}
