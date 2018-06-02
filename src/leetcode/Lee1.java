package leetcode;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * created by zsj in 23:58 2018/4/23
 * description:
 **/
public class Lee1 {
    public static void main(String[] args) {
        String userName = "username";
        long userId = 72L;
        String examName = "examName";
        long examId = 1732L;
        System.out.println(String.format("用户名：%s, 用户id: %d, 考试名：%s, 考试id: %d,访问时间：",
                userName, userId, examName, examId));
        System.out.println(String.format("用户名：%s, 用户Id: %d",userName,userId));
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    }
}
