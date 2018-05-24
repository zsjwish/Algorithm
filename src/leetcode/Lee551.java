package leetcode;

/**
 * created by zsj in 11:53 2018/5/24
 * description:给定一个字符串来代表一个学生的出勤纪录，这个纪录仅包含以下三个字符：
 * 'A' : Absent，缺勤
 * 'L' : Late，迟到
 * 'P' : Present，到场
 * 如果一个学生的出勤纪录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。
 * 你需要根据这个学生的出勤纪录判断他是否会被奖赏。
 **/
public class Lee551 {

    public static void main(String[] args) {

    }

    public boolean checkRecord(String s) {
        int numA = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                numA++;
                if (numA >=2) {
                    return false;
                }
            }
        }
        return !s.contains("LLL");
    }

}
