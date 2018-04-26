package leetcode;

/**
 * created by zsj in 14:38 2018/4/26
 * description:给定一个只包含小写字母的有序数组letters 和一个目标字母 target，寻找有序数组里面比目标字母大的最小字母。
 * 数组里字母的顺序是循环的。举个例子，如果目标字母target = 'z' 并且有序数组为 letters = ['a', 'b']，则答案返回 'a'。
 **/
public class Lee744 {

    public static void main(String[] args) {
        char[] chars = new char[] {'c','f','g'};
        Lee744 lee744 = new Lee744();
        lee744.nextGreatestLetter(chars, 'f');
    }
    public char nextGreatestLetter(char[] letters, char target) {
        if (target >= letters[letters.length-1]) {
            System.out.println(letters[0]);
            return letters[0];
        }
        int low = 0, high = letters.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (target < letters[mid]) high = mid;
            else low = mid + 1;
        }
        System.out.println(letters[low]);
        return letters[low];
    }

}
