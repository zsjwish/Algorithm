package interview;

import java.util.Arrays;
import java.util.Scanner;

/**
 * created by zsj in 18:57 2018/5/10
 * description:
 **/
public class PinDuoDuoOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(getNum(N, nums));

    }

    public static int getNum(int N, int[] nums) {
        int[] resNum = new int[4];
        int res = 0;
        for (int i = 0; i < N; i++) {
            resNum[nums[i]-1]++;
        }
        System.out.println(Arrays.toString(resNum));
        //对于四个人的组
        res += resNum[3];
        //对于三个人
        if (resNum[0] <= resNum[2]) {
            resNum[0] = 0;
        }
        else {
            resNum[0] -= resNum[2];
        }
        res += resNum[2];
        //对于两个人的组
        res += resNum[1] / 2;
        if (resNum[1] % 2 == 0) {
            resNum[1] = 0;
        }
        else {
            resNum[1] = 1;
        }
        //对于一个人的组
        if (resNum[0]!=0) {
            if (resNum[1]!=0) {
                res++;
                resNum[0] = resNum[0] > 2 ? resNum[0] - 2 : 0;
            }
            res += Math.ceil((double)resNum[0] / 4);
        }
        return res;
    }

}
