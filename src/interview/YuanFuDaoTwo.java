package interview;
import java.util.ArrayList;

/**
 * created by zsj in 14:07 2018/5/10
 * description:实现一个接口，能够实现添加一个数，取出已经添加进来的数中的中位数
 **/
public class YuanFuDaoTwo {

    ArrayList<Integer> arrayList;

    public static void main(String[] args) {
        YuanFuDaoTwo yfd = new YuanFuDaoTwo();
        yfd.addNode(1);
        yfd.addNode(5);
        yfd.addNode(8);
        yfd.findMidNum();
        yfd.addNode(2);
        yfd.addNode(3);
        yfd.addNode(4);
        yfd.addNode(89);
        yfd.findMidNum();
    }

    public YuanFuDaoTwo() {
        this.arrayList = new ArrayList<>();
    }

    public void addNode(int num) {
        arrayList.add(num);
        System.out.println(arrayList);
    }

    public int findMidNum() {
        int target = 0;
        int mid = arrayList.size() / 2;
        int low = 0,high = arrayList.size() - 1;
        while (low < high) {
            int tmp = partition(low, high);
            if (tmp == mid) {
                System.out.println(arrayList.get(tmp));
                return arrayList.get(tmp);
            }
            else if (mid > low && mid < tmp) {
                high = tmp - 1;
            }
            else if (mid < high && mid > tmp) {
                low = tmp + 1;
            }
        }
        return 0;
    }

    private int partition(int start, int end) {
        int tmp = arrayList.get(start);
        int low = start, high = end;
        while (low < high) {
            while (low < high && arrayList.get(low) < tmp) {
                low++;
            }
            while (low < high && arrayList.get(high) >  tmp) {
                high--;
            }
            if (low < high) {
                int cur = arrayList.get(low);
                arrayList.set(low, arrayList.get(high));
                arrayList.set(high, cur);
            }
        }
        return low;
    }



}
