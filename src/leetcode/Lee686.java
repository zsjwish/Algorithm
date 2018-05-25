package leetcode;

/**
 * created by zsj in 13:39 2018/5/25
 * description:给定两个字符串 A 和 B, 寻找重复叠加字符串A的最小次数，
 * 使得字符串B成为叠加后的字符串A的子串，如果不存在则返回 -1。
 * 举个例子，A = "abcd"，B = "cdabcdab"。
 * 答案为 3， 因为 A 重复叠加三遍后为 “abcdabcdabcd”，此时 B 是其子串；A 重复叠加两遍后为"abcdabcd"，B 并不是其子串。
 **/
public class Lee686 {

    public static void main(String[] args) {
        Lee686 lee686 = new Lee686();
        System.out.println(lee686.repeatedStringMatch("a","aa"));
    }

    public int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder(A);
        int res = 1;
//        while (!sb.toString().contains(B)) {
//            if (sb.length() >= 2*B.length()) {
//                return -1;
//            }
//            sb.append(A);
//            res++;
//
//        }
        for (; sb.length() < B.length(); res++) {
            sb.append(A);
        }
        if (sb.indexOf(B) >= 0) {
            return res;
        }
        if (sb.append(A).indexOf(B)>=0) {
            return res+1;
        }
        return -1;


    }

}
