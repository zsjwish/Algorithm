package interview;

import java.util.Scanner;

/**
 * created by zsj in 19:43 2018/9/25
 * description:桌上摆着9张扑克牌，摆成3*3的造型，这些扑克牌比较奇怪，如果你对某一张扑克牌进行翻转，
 * 那么它上下左右四张扑克牌都会进行翻转，（如果某个方向没有则不翻），现在你想将所有的扑克变成正面朝上，最少需要多少步呢？
 **/
public class Ebay1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nums = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        int res = 0;
        int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        while (!invalid(nums)) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                }
            }
        }
    }

    public static boolean invalid(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }




}
