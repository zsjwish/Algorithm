package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 11:10 2018/4/28
 * description:给定一个无序的数组nums，将它重新排列成nums[0] < nums[1] > nums[2] < nums[3]...的顺序。
 * 要求：O(N)时间复杂度，O(1)空间复杂度
 * 例子:
 * (1) 给定nums = [1, 5, 1, 1, 6, 4]，一个可能的结果是[1, 4, 1, 5, 1, 6]。
 * (2) 给定nums = [1, 3, 2, 2, 3, 1]，一个可能的结果是[2, 3, 1, 3, 1, 2]。
 * 思路：对数组重排序，将前半部分倒序放入奇数位，后半部分倒序放入偶数位
 **/
public class Lee324 {

    public static void main(String[] args) {
        int[] nums = new int[] {1,5,1,1,6,4};
        Lee324 lee324 = new Lee324();
        lee324.wiggleSort(nums);
    }

    public void wiggleSort(int[] nums) {
        int[] tmp = nums.clone();
        Arrays.sort(tmp);
        int mid = (nums.length - 1) / 2;
        int j = 0;
        for (int i = mid; i >= 0; i--, j = j+2) {
            nums[j] = tmp[i];
        }
        j = 1;
        for (int i = nums.length - 1; i > mid; i--, j = j+2) {
            nums[j] = tmp[i];
        }
        System.out.println(Arrays.toString(nums));
    }

}
