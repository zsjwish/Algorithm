package leetcode;

/**
 * created by zsj in 12:54 2018/5/8
 * description:编写一个函数来检查输入字符串是有效的IPv4地址还是IPv6地址，或者都不是。
 **/
public class Lee468 {
    public static void main(String[] args) {
        Lee468 lee468 = new Lee468();
        System.out.println(lee468.validIPAddress("172.16.254.1"));
    }
    public String validIPAddress(String IP) {
        IP = IP.toLowerCase();
        System.out.println(IP);
        String ip4Str = "0123456789";
        String ip6Str = "0123456789abcdef";
        String[] ip4 = IP.split("[.]",4);
        String[] ip6 = IP.split(":",8);
        if (ip4.length!=4 && ip6.length != 8) {
            return "都不";
        }
        if (ip4.length == 4) {
            for (String tmp : ip4) {
                if (tmp.length() > 3 || tmp.length() <= 0) {
                    return "都不";
                }
                for (char chartmp : tmp.toCharArray()) {
                    if (!ip4Str.contains(chartmp+"")) {
                        return "都不";
                    }
                }
                int num = Integer.valueOf(tmp);
                if (num < 0 || num > 255 || (""+num).length() != tmp.length()) {
                    return "都不";
                }
            }
            return "IPv4";
        }
        if (ip6.length == 8) {
            for (String tmp : ip6) {
                if (tmp.length() == 1 && tmp.equals("0")) {
                    continue;
                }
                if (tmp.length() > 4) {
                    return "都不";
                }
                for (char chartmp : tmp.toCharArray()) {
                    if (!ip6Str.contains(chartmp+"")) {
                        return "都不";
                    }
                }
            }
            return "IPv6";
        }
        return "都不";
    }
}
