package leetcode;

/**
 * created by zsj in 21:53 2018/5/24
 * description:
 * 冬季已经来临。 你的任务是设计一个有固定加热半径的供暖器向所有房屋供暖。
 * 现在，给出位于一条水平线上的房屋和供暖器的位置，找到可以覆盖所有房屋的最小加热半径。
 * 所以，你的输入将会是房屋和供暖器的位置。你将输出供暖器的最小加热半径。
 * 说明:
 * 给出的房屋和供暖器的数目是非负数且不会超过 25000。
 * 给出的房屋和供暖器的位置均是非负数且不会超过10^9。
 * 只要房屋位于供暖器的半径内(包括在边缘上)，它就可以得到供暖。
 * 所有供暖器都遵循你的半径标准，加热的半径也一样。
 *
 * -----------------------------------------未完成 2018年5月24日
 **/
public class Lee475 {
    public static void main(String[] args) {
        Lee475 lee475 = new Lee475();
        System.out.println(lee475.findRadius(new int[]{1,2,3},new int[]{2}));
    }
    public int findRadius(int[] houses, int[] heaters) {
        int max = 0;
        for (int i = 0; i < heaters.length-1; i++) {
            max = Math.max(max, heaters[i+1] - heaters[i]);
        }
        int max1 = Math.max(heaters[0] - houses[0], houses[houses.length - 1] - heaters[0]);
        int max2 = Math.max(heaters[heaters.length - 1] - houses[0], houses[houses.length - 1] - heaters[heaters.length-1]);
        int max3 = Math.min(max1,max2);
        return Math.min(max/2, max3);
    }
}
