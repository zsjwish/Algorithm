package recode;

/**
 * created by zsj in 17:34 2018/5/26
 * description:编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 **/
public class MaxStartString {
    public static void main(String[] args) {
        MaxStartString maxStartString = new MaxStartString();
        System.out.println(maxStartString.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String tmp = "";
        for (int i = 1; i <= strs[0].length(); i++) {
            tmp = strs[0].substring(0,i);
            for (String str : strs) {
                if (!str.startsWith(tmp)) {
                    if (tmp.length() == 1) {
                        return "";
                    }
                    else {
                        return tmp.substring(0,i-1);
                    }
                }
            }
        }
        return tmp;
    }
}
