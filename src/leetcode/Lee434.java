package leetcode;

/**
 * created by zsj in 22:16 2018/5/6
 * description:统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 **/
public class Lee434 {

    public static void main(String[] args) {


    }

    public int countSegments(String s) {
        s = s.trim();
        String[] res = s.split(" ");
        int sum = 0;
        for (String tmp : res) {
            if (tmp.isEmpty()) {
                continue;
            }
            sum++;
        }
        return sum;
    }

}
