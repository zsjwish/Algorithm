package leetcode;

/**
 * created by zsj in 11:50 2018/5/5
 * description:在无限的整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...中找到第 n 个数字。
 * 第11个数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是0，它是10的一部分。
 **/
public class Lee400 {

    public static void main(String[] args) {
        Lee400 lee400 = new Lee400();
        lee400.findNthDigit(1000000000);
//        String s = "acb";
//        System.out.println();
    }

    public int findNthDigit(int n) {
        if (n <= 9) {
            return n;
        }
        int len = 1;
        Long num = 9L;
        Long sum = 9L;
        //记录到上一个阶段整个数位的值，例如数字在999之后就是记录1-999所有的数位之和。
        Long last = 0L;
        while (n > sum) {
            last = sum;
            len++;
            num *= 10;
            sum += len * num;
        }
        //记录上一个阶段的最后的值，例如在数字999之后的话就记录999
        int curNumMax = (int)Math.pow(10, len-1) -1;
//        System.out.println("curNum:"+curNumMax);
//        System.out.println("位移："+Math.ceil((n - last) / len));
        int pos = (int)Math.ceil((double)(n - last) / len) + curNumMax;
        System.out.println(pos);
        int cur = (int)(n - last - (pos - curNumMax - 1) * len);
//        System.out.println(cur);
        System.out.println(Integer.valueOf((pos+"").charAt(cur - 1) - '0'));
        return Integer.valueOf((pos+"").charAt(cur - 1) - '0');
    }

}
