package codeInterview;

/**
 * created by zsj in 14:49 2018/5/4
 * description: 进制间相互转换，十进制转N进制，N进制转10进制
 **/
public class JinZhi {

    public static void main(String[] args) {
        JinZhi jinZhi = new JinZhi();
        jinZhi.nToTen("126",5);
    }

    public String tenToN(int num, int j) {
        StringBuffer sb = new StringBuffer();
        boolean neg = false;
        if (num < 0) {
            neg = true;
            num = -num;
        }
        while (num >= j) {
            sb.append(num % j);
            num /= j;
        }
        sb.append(num);
        String res = neg ? "-" : "" + sb.reverse();
        System.out.println(res);
        return res;
    }

    public int nToTen(String n, int j) {
        if (n == null || n.length() == 0) {
            return -1;
        }
        int length = n.length();
        int res = 0;
        for (int i = length-1; i >= 0; i--) {
            int tmp = Integer.valueOf(n.charAt(i) - '0');
            if (tmp >= j) {
                System.out.println(String.format("输入格数错误，%d进制不会有%s",j,n));
                return -1;
            }
            res += tmp * Math.pow(j, length - i - 1);
        }
        System.out.println(res);
        return res;
    }

}
