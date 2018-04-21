package list;

/**
 * created by zsj in 13:30 2018/4/21
 * description:最大回文子串，输入一个字符串，输出最大回文子串，思路，从中心扩散式判断是否是回文子串，
 * 这时有两种思路，一种是以自身为中心，回文串是奇数，一种是以自己和下一位为中心，回文串是偶数。最后返回回文串的长度
 * 主函数getMaxPalSubStr调用判断回文串的函数得出最长的回文串，在更新max的时候得出start和end以便于在程序结束输出和返回。
 **/
public class MaxPalSubstrings {

    public static void main(String[] args) {
        MaxPalSubstrings maxPalSubstrings = new MaxPalSubstrings();
        maxPalSubstrings.getMaxPalSubStr("ababab");
    }

    public String getMaxPalSubStr(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        int length = s.length();
        int start = 0, end = 0;
        for (int i = 0; i < length-1; i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i+1);
            int max = Math.max(len1,len2);
            if (max > end - start + 1) { //if (max > end - start) 如果是判断max>end-start的话得到的是最后一个最长回文串。
                start = i - (max - 1) / 2;
                end = i + max / 2;
            }
        }
        System.out.println(s.substring(start, end+1));
        return s.substring(start, end+1);
    }

    public int expandAroundCenter(String s, int left, int right) {
        int res = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        //是在自加后发现不同跳出循环，所以最后left--和right++不能算，所以应该是在right-left+1的基础上-2，所以是right-lef-1;
        return right-left-1;
    }
}
