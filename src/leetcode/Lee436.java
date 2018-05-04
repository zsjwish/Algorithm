package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 11:40 2018/5/4
 * description:
 **/
public class Lee436 {

    public static void main(String[] args) {
        Interval interval1 = new Interval(3,4);
        Interval interval2 = new Interval(2,3);
        Interval interval3 = new Interval(1,2);
        Interval[] intervals = new Interval[]{interval1,interval2,interval3};
        Lee436 lee436 = new Lee436();
        lee436.findRightInterval(intervals);
    }

    public int[] findRightInterval(Interval[] intervals) {
        if(intervals == null) {
            return null;
        }
        int length = intervals.length;
        int[] res = new int[length];
        if(length == 0) {
            return res;
        }
        if(length == 1) {
            res[0] = -1;
            return res;
        }
        for(int i = 0; i < length; i++) {
            int endCurr = intervals[i].end;
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < length; j++) {
                if (j == i) {
                    continue;
                }
                int tmp = intervals[j].start;
                if(tmp >= endCurr) {
                    if (min != Integer.MAX_VALUE && tmp < intervals[min].start) {
                        min = j;
                    }
                    else if (min == Integer.MAX_VALUE){
                        min = j;
                    }
                }
            }
            if(min == Integer.MAX_VALUE) {
                res[i] = -1;
            }
            else {
                res[i] = min;
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

}

class Interval {
    int start;
    int end;
    Interval() {
        start = 0;
        end = 0;
    }
    Interval(int s, int e) {
        start = s;
        end = e;
    }
}
