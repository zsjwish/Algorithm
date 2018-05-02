package leetcode;

/**
 * created by zsj in 12:55 2018/5/2
 * description:
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 **/
public class Lee171 {

    public static void main(String[] args) {
        Lee171 lee171 = new Lee171();
        lee171.titleToNumber("ZY");
    }

    public int titleToNumber(String s) {
        int tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            tmp *= 26;
            tmp += (int)(s.charAt(i) - 'A' + 1);
        }
        System.out.println(tmp);
        return tmp;
    }

}
