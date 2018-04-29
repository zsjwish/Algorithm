package leetcode;

/**
 * created by zsj in 16:58 2018/4/29
 * description:给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 **/
public class Lee167 {

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) {
            return numbers;
        }
        int low = 0, high = numbers.length-1;
        int[] res = new int[2];
        while (low < high) {
            if (numbers[low] + numbers[high] == target) {
                res[0] = low+1;
                res[1] = high+1;
                return res;
            }
            else if (numbers[low] + numbers[high] > target) {
                high--;
            }
            else {
                low++;
            }
        }
        return res;
    }

}
