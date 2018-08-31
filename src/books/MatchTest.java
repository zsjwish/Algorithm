package books;

/**
 * created by zsj in 22:13 2018/8/31
 * description:
 **/
public class MatchTest {
    public static void main(String[] args) {
        String s = "123asdwfdsv123sd 4565sdfdsfsd fds 123fds fds fds 123fdswerwerwerw";
        String s1 = s.replaceAll("\\d{3}","江");
        System.out.println(s);
        System.out.println(s1);
        String s2 = s.replace("123", "双");
        String s3 = s.replaceFirst("\\d{3}", "双");
        System.out.println(s2);
        System.out.println(s3);
    }
}
