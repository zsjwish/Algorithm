package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 20:59 2018/5/7
 * description:对只有0,1,2的数组排序，使顺序为000001111122222
 * 条件：O(1)空间复杂度。也就是要在原来数组进行
 **/
public class Lee75 {

    public static void main(String[] args) {
        Lee75 lee75 = new Lee75();
        lee75.sortColors(new int[] {2,2,2,2,2,2,2,2,1,1,1,1,1,1,1,2,0,2,1,1,2,0,2,1,1,2,0,2,1,1,2,0,2,1,1,1,1,1,1,1,1});
    }

    public void sortColors(int[] nums) {
        int red = 0;
        int blue = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i]==2 && i < blue){
                swap(nums,i,blue--);
            }
            while(nums[i]==0 && i>red){
                swap(nums,i,red++);
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public void swap(int[] n, int i, int j){
        int tmp = n[i];
        n[i] = n[j];
        n[j] = tmp;
    }


}
