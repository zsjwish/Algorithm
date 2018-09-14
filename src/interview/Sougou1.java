package interview;

import java.util.*;

/**
 * created by zsj in 17:37 2018/9/14
 * description:
 **/
public class Sougou1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            int tmp = sc.nextInt();
            list.add(tmp);
            set.add(tmp);
        }
        List<String> res =getMinArea(list,set);
        System.out.println(res.size());
        for (String tmp : res) {
            System.out.print(tmp+" ");
        }
        System.out.println();

    }

    public static List<String>  getMinArea(List<Integer> list, Set<Integer> set) {
        int minArea = Integer.MAX_VALUE;
        int length = list.size();
        for (int i = 0; i < length; i++) {
            for (int j = 0; i + j < length; j++) {
                if (list.subList(i,i+j+1).containsAll(set)) {
                    minArea = Math.min(minArea, j);
                    break;
                }
            }
        }
        List<String> res = new LinkedList<>();
        for (int i = 0; i + minArea < list.size(); i++) {
            if (list.subList(i, i+minArea + 1) .containsAll(set)) {
                res.add(i+"-"+(i+minArea));
            }
        }
        return res;
    }
}
