package leetcode;

import java.util.Stack;

/**
 * created by zsj in 18:55 2018/10/3
 * description:
 **/
public class Lee402 {
    public static void main(String[] args) {
//        System.out.println(removeOneDigits("1002304"));
//        System.out.println(removeKdigits("102304", 5));
        System.out.println(removeKdigits1("52660469", 12));
    }



    public static String removeKdigits1(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(char c:num.toCharArray()){
            // if current c is smaller than previous one, stack pop
            while(!st.empty()&&k>0&&st.peek()>c){
                st.pop();
                k--;
            }
            st.push(c);
        }
        StringBuilder sb=new StringBuilder();
        while(!st.empty()){
            // if k is greater than 0, it still need to remove from last.
            // Because last ones are biggest.
            if(k-->0){
                st.pop();
            }else{
                sb.insert(0,st.pop());
            }
        }
        // remove preceeding "0"
        int i=0;
        while(i<sb.length()&&sb.charAt(i)=='0'){
            i++;
        }
        return i>=sb.length()?"0":sb.substring(i);
    }

    public static String removeStartZero(String num) {
        StringBuilder sb = new StringBuilder(num);
        int i = 0;
        for (i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '0') {
                break;
            }
        }
        String res = sb.substring(i);
        return res.length() == 0 ? "0" : res;
    }

    public static String removeOneDigits(String num) {
        num = num.trim();
        if (num == null || num.length() == 1) {
            return num;
        }
        StringBuilder sb = new StringBuilder(num);
        if (sb.charAt(1) == '0') {
            String res = removeStartZero(sb.substring(2));
            return res;
        }
        else {
            int midIndex = 0;
            int maxIndex = 0;
            boolean isMidFlag = false;
            for (int i = 1; i < sb.length() - 1; i++) {
                if (sb.charAt(i) > sb.charAt(maxIndex)) {
                    maxIndex = i;
                }
                if (sb.charAt(1) < sb.charAt(0)) {
                    midIndex = 0;
                    isMidFlag = true;
                    break;
                }
                if (sb.charAt(i) >= sb.charAt(i - 1) && sb.charAt(i) >= sb.charAt(i + 1)) {
                    midIndex = i;
                    isMidFlag = true;
                    break;
                }
            }
            if (!isMidFlag) {
                if (sb.charAt(sb.length() - 1) > sb.charAt(maxIndex)) {
                maxIndex = sb.length() - 1;
            }
                sb.deleteCharAt(maxIndex);
            }
            else {
                sb.deleteCharAt(midIndex);
            }
            return sb.toString();
        }
    }

    public static String removeKdigits(String num, int k) {
        num = num.trim();
        if (k == 0) {
            return num;
        }
        if (num.length() <= k) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(num);
        if (k == 1) {
            return removeOneDigits(num);
        }
        else {
            num = removeOneDigits(num);
            return removeKdigits(num, k-1);
        }
    }
}
