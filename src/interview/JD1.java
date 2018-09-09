package interview;

import java.util.*;

/**
 * created by zsj in 20:23 2018/9/9
 * description:
 **/
public class JD1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int group = sc.nextInt();
        Graph[] graphs = new Graph[group];
        for (int i = 0; i < group; i++) {
            graphs[i] = new Graph();
            graphs[i].max = sc.nextInt();
            graphs[i].v = sc.nextInt();
            int[][] res = new int[graphs[i].v][2];
            for (int j = 0; j < graphs[i].v; j++) {
                res[j][0] = sc.nextInt();
                res[j][1] = sc.nextInt();
            }
            graphs[i].res = res;
            graphs[i].reSort(graphs[i].res);
        }
        for (int i = 0; i < group; i++) {
            System.out.println(graphs[i].getRes());
        }

    }
}
class Graph{
    int max;
    int v;
    int[][] res;
    public void reSort(int[][] res) {
        Arrays.sort(res, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] > o2[0]) {
                    return 1;
                }
                else if (o1[0] < o2[0]) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
    }

    public boolean getRes() {
        List<List<Integer>> list = new ArrayList<>(max);
        int index = 1;
        boolean add = false;
        for (int i = 0; i < max; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < max; i++) {
            list.get(0).add(i);
        }
        for (int i = 0; i < v; i++) {
            int second = res[i][1];
            add = false;
            for (int j = index-1; j >= 0; j--) {
                if (list.get(j).contains(second)) {
                    list.get(j).remove(Integer.valueOf(second));
                    list.get(index).add(second);
                    add = true;
                }
            }
            if (add) {
                index++;
            }
        }
        int[] size = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            size[i] = list.get(i).size();
        }
        int res = 0;
        for (int i = 0; i < size.length; i++) {
            if (size[i] == 0) {
                continue;
            }
            for (int j = i+1; j < size.length; j++) {
                if (size[j] == 0) {
                    continue;
                }
                res += size[i]*size[j];
            }
        }
        if (res == v) {
            return true;
        }
        return false;

    }
}
