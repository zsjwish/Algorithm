package interview;

import java.util.Arrays;

/**
 * created by zsj in 21:19 2018/8/30
 * description:
 **/
public class SplitTest {
    public static void main(String[] args) {
        String str = "asdadgfdfad.fdsafdf..dfdfdfdf.ef.rf.rgt.gb.gb";
        String[] strings = str.split("\\.");
        System.out.println(Arrays.deepToString(strings));


    }
}
