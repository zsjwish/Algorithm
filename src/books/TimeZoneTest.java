package books;

import java.util.Arrays;
import java.util.TimeZone;

/**
 * created by zsj in 21:45 2018/8/31
 * description:
 **/
public class TimeZoneTest {
    public static void main(String[] args) {
        String[] ids = TimeZone.getAvailableIDs();
        System.out.println(Arrays.toString(ids));
        System.out.println(TimeZone.getDefault());
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone.getDisplayName());
    }
}
