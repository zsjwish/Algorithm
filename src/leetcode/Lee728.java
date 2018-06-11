package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * created by zsj in 11:07 2018/6/11
 * description:自除数 是指可以被它包含的每一位数除尽的数。
 * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 * 还有，自除数不允许包含 0 。
 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
 **/
public class Lee728 {
    public static void main(String[] args) {
        Lee728 lee728 = new Lee728();
        System.out.println(lee728.isSelfDivNum(102));
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new LinkedList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDivNum(i)) {
                list.add(i);
            }
        }
        return list;
    }
    public boolean isSelfDivNum(int num) {
        int tmp = num;
        while (tmp != 0) {
            int cur = tmp%10;
            if (cur == 0 || num%cur != 0) {
                return false;
            }
            tmp /= 10;
        }
        return true;
    }
}
