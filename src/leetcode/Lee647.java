package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * created by zsj in 14:14 2018/4/21
 * description:找出一个字符串的所有回文子串，在以某个字符为中心扩展的时候讲回文子串写到一个list中，然后返回，
 * 返回后使用一个list添加所有的回文子串的list。最后可以返回list或者list的长度。
 **/
public class Lee647 {
    public static void main(String[] args) {
        Lee647 lee647 = new Lee647();
        lee647.countSubstrings("abcc");
    }

    public List<String> countSubstrings(String s) {
        List<String> res= new LinkedList<>();
        if (s == null || s.length() == 0) {
            return res;
        }
        int length = s.length();
        for (int i = 0; i < length; i++) {
            res.addAll(extendRoundCenter(s, i, i));
            res.addAll(extendRoundCenter(s, i, i+1));
        }
        System.out.println(res);
        System.out.println(res.size());
        return res;
    }

    public List<String> extendRoundCenter(String s, int start, int end) {
        List<String> res = new LinkedList<>();
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            res.add(s.substring(start,end+1));
            start --;
            end ++;
        }
        return res;
    }

}
