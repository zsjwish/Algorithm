package leetcode;

/**
 * created by zsj in 10:25 2018/4/30
 * description:给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，
 * 判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false。
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
 * 思路：数组存放magazines的字符，然后ransom对应减去1.看是否小于0，小于0则说明不可以
 **/
public class Lee383 {

    public static void main(String[] args) {

    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] tmp = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            tmp[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            tmp[ransomNote.charAt(i) - 'a']--;
            if (tmp[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }


}
