package newcoder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * created by zsj in 22:03 2018/5/2
 * description:从某个日期开始算，推后n天是几月几号星期几。
 * 输入：日期，yyyy-MM-dd;
 * 输出：日期：yyyy-MM-dd 星期几
 **/
public class DateTime {
    public static void main(String[] args) throws ParseException {
        DateTime dateTime = new DateTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String s = "2014-04-01";
        Date date = simpleDateFormat.parse(s);
        System.out.println(simpleDateFormat.format(date));
        System.out.println(simpleDateFormat.format(dateTime.getDay(date,224)));

    }


    public Date getDay(Date date, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(calendar.DATE, day);
//        System.out.println(calendar.getTime());
        return calendar.getTime();
    }

    public String getAfterDay(Date date, int after) {
        int[] months = new int[] {0,31,28,31,30,31,30,31,31,30,31,30,31};
        String str = date.toString();
        String[] sArrays = str.split("-");
        int year = Integer.valueOf(sArrays[0]);
        int month = Integer.valueOf(sArrays[1]);
        int day = Integer.valueOf(sArrays[2]);
        int afterYear = 0;
        int afterMonth = 0;
        int afterDay = 0;
        if (isRun(year))
        if (after < months[month] - day) {

        }
        return null;

    }
    public boolean isRun(int year) {
        if ((year%4 == 0 && year%100!=0) || year%400 == 0) {
            return true;
        }
        return false;
    }
}
