package leetcode;

/**
 * created by zsj in 10:53 2018/4/23
 * description:报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 1.     1
 2.     11
 3.     21
 4.     1211
 5.     111221
 1的时候就是1；2的时候读上一个数是1个1，所以是11；3的时候读上一个11，是两个一，所以是21；
 4的时候读上一个是21，所以是一个二一个1即1211； 5的时候读上一个是1211，所以是一个一，一个二，两个一，即111221
 思路：递归，下一次利用上一次结果，对上一次结果进行分析得出结果，注意在字符串末尾加上一个标记，方便在循环中输出！！！
 **/
public class Lee38 {

    public static void main(String[] args) {
        Lee38 lee38 = new Lee38();
        lee38.countAndSay(5);
    }
    public String countAndSay(int n) {
        if (n == 1) {
            System.out.println(1);
            return "1";
        }
        //在末尾加上一个标记，以便于在循环中一定能进行到else中进行输出，因为如果不加标记，在遇到末尾两个是相同的数的时候
        //循环会直接跳出不会进行else里面进行输出，就会造成错误。
        String str = countAndSay(n-1) + "*";
        char[] chars = str.toCharArray();
        int count = 1;
        String res = "";
        for (int i = 0; i < str.length()-1; i++) {
            if (chars[i] == chars[i+1]) {
                count++;
            }
            else {
                res = res + count + chars[i];
                count = 1;
            }
        }
        System.out.println(res);
        return res;
    }

}
