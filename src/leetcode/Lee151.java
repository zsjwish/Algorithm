package leetcode;

/**
 * created by zsj in 13:04 2018/5/16
 * description:给定一个字符串，逐个翻转字符串中的每个单词
 **/
public class Lee151 {

    public static void main(String[] args) {
        Lee151 lee151 = new Lee151();
        lee151.reverseWords("the sky is blue");
    }

    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) {
            if (strs[i].length() > 0) {
                sb.append(strs[i]);
                sb.append(" ");
            }
        }
        System.out.println(sb.toString().trim());
        return sb.toString().trim();
    }
}
