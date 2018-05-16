package leetcode;

/**
 * created by zsj in 13:14 2018/5/16
 * description:给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc"
 **/
public class Lee557 {
    public static void main(String[] args) {
        Lee557 lee557 = new Lee557();
        lee557.reverseWords("Let's take LeetCode contest");
    }

    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() > 0) {
                sb.append(new StringBuffer(strs[i]).reverse());
                sb.append(" ");
            }
        }
        System.out.println(sb.toString().trim());
        return sb.toString().trim();
    }
}
