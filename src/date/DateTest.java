package date;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * created by zsj in 14:07 2018/6/25
 * description:
 **/
public class DateTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH-mm-ss");
        SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY-MM-dd");
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        System.out.println(ts);
        System.out.println(date.getTime()+"----111111111111");
        System.out.println(sdf.parse(sdf.format(date)));
        System.out.println();
        System.out.println(sdf.parse(sdf1.format(date)));
    }
}
