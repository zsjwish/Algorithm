package leetcode;

/**
 * created by zsj in 21:28 2018/5/23
 * description:给定一个单词，你需要判断单词的大写使用是否正确。
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 * 全部字母都是大写，比如"USA"。
 * 单词中所有字母都不是大写，比如"leetcode"。
 * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
 * 否则，我们定义这个单词没有正确使用大写字母。
 **/
public class Lee520 {
    public static void main(String[] args) {

    }
    public boolean detectCapitalUse(String word) {
        if (word == null || word.length() == 0) {
            return false;
        }
        String tmp = new String(word);
        String tmp1 = tmp.toLowerCase();
        String tmp2 = tmp.toUpperCase();
        char[] chars = tmp1.toCharArray();
        if (Character.isLowerCase(chars[0])) {
            chars[0] -= 32;
        }
        String tmp3 = String.valueOf(chars);
        if (word.equals(tmp1) || word.equals(tmp2) || word.equals(tmp3)) {
            return true;
        }
        return false;

    }

}
