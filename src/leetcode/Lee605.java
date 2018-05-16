package leetcode;

/**
 * created by zsj in 13:23 2018/5/16
 * description:假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。
 * 可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
 * 给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数 n 。
 * 能否在不打破种植规则的情况下种入 n 朵花？能则返回True，不能则返回False。
 **/
public class Lee605 {

    public static void main(String[] args) {
        Lee605 lee605 = new Lee605();
        int[] nums1 = new int[] {1,0,0,0,1};
        int[] nums2 = new int[] {0};
        int[] nums = new int[] {0,1,0};
        lee605.canPlaceFlowers(nums,1);
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0, count = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (i==0 || flowerbed[i-1] ==0) && (i == flowerbed.length - 1 || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            i++;
        }
        System.out.println(count>=n);
        return count >= n;
    }

    public boolean canPlaceFlowers1(int[] flowerbed, int n) {
        if (flowerbed == null || flowerbed.length == 0) {
            return false;
        }
        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            if (n <= 1) {
                return true;
            }
            return false;
        }
        int res = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i]==0) {
                if (i == 0 ) {
                    if (flowerbed[i+1] == 0) {
                        res++;
                        flowerbed[i] = 1;
                    }
                }
                else if (i == flowerbed.length-1) {
                    if (flowerbed[flowerbed.length-2] == 0) {
                        res++;
                        flowerbed[i] = 1;
                    }
                }
                else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        res++;
                        flowerbed[i] = 1;
                }
            }
        }
        System.out.println(res);
        System.out.println(res>=n);
        return res >= n;
    }

}
