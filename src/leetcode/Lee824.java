package leetcode;

import java.util.Arrays;

/**
 * created by zsj in 19:04 2018/5/24
 * description:S给出一个句子，由用空格分隔的单词组成。每个单词只包含小写字母和大写字母。
 * 我们想将句子转换成“ 山羊拉丁语”  （一种类似于拉丁语的化妆语言）。
 * 山羊拉丁文规则如下：
 * 如果一个单词以元音开头（a，e，i，o或u），则追加"ma" 到单词的末尾。
 * 例如，'apple'这个词变成'applema'。
 * 如果一个单词以辅音开头（即不是元音），删除第一个字母并将其附加到最后，然后添加"ma"。
 * 例如，这个词"goat" 变成了"oatgma"。
 * 'a' 在每个单词的末尾添加一个字母，每个单词的索引在句子中以1开始。
 * 例如，第一个单词被"a"添加到结尾，第二个单词被"aa"添加到结尾，依此类推。
 * 返回代表从S Goat Latin 转换成的最后一句。
 **/
public class Lee824 {
    public static void main(String[] args) {
        Lee824 lee824 = new Lee824();
        System.out.println(lee824.toGoatLatin("I speak Goat Latin"));
    }
    public String toGoatLatin(String S) {
        String[] res = S.split(" ");
        for (int i = 0; i < res.length; i++) {
            StringBuilder sb = new StringBuilder(res[i]);
            char ch = sb.substring(0,1).toLowerCase().charAt(0);
            if (!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')) {
                char tmp = sb.charAt(0);
                sb = sb.deleteCharAt(0);
                sb.append(tmp);
            }
            sb.append("ma");
            for (int j = 0; j <= i; j++) {
                sb.append("a");
            }
            res[i] = sb.toString();
        }
        System.out.println(Arrays.toString(res));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            sb.append(res[i]);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
