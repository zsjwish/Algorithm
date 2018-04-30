package leetcode;

/**
 * created by zsj in 16:33 2018/4/30
 * description:给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 **/
public class Lee58 {

    public static void main(String[] args) {
        Lee58 lee58 = new Lee58();
        lee58.lengthOfLastWord("   zsj yss sdss ");
    }

    public int lengthOfLastWord1(String s) {
        s.trim();
        if (s == null) {
            return 0;
        }
        String[] strings = s.split(" ");
        return strings[strings.length-1].length();
    }
    public int lengthOfLastWord(String s) {
        s = s.trim();
        System.out.println(s);
        int low = s.length()-1;
        while (s.charAt(low) != ' ') {
            low--;
        }
        System.out.println(low);
        System.out.println(s.length() - low - 1);
        return s.length() - low - 1;
    }
}
