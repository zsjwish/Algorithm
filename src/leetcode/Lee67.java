package leetcode;

/**
 * created by zsj in 16:44 2018/4/30
 * description:给定两个二进制字符串，返回他们的和（用二进制表示）。
 * 输入为非空字符串且只包含数字 1 和 0。
 **/
public class Lee67 {

    public static void main(String[] args) {
        Lee67 lee67 = new Lee67();
        lee67.addBinary("11", "1");
    }


    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int i = a.length() - 1, j = b.length() - 1;
        int sum = 0;
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            sb.append(sum % 2);
            sum /= 2;
        }
        if (sum == 1) {
            sb.append(sum);
        }
        return sb.reverse().toString();
    }

    public String addBinary1(String a, String b) {
        int num1 = binaryToTen(a);
        int num2 = binaryToTen(b);
        int sum = num1 + num2;
        String res = tenToBinary(sum);
        return res;
    }

    public int binaryToTen(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int length = s.length() - 1;
        int i = length;
        int res = 0;
        while (i>=0) {
            if (s.charAt(i) == '1') {
                res += Math.pow(2, length - i);
            }
            i--;
        }
        System.out.println(res);
        return res;
    }

    public String tenToBinary(int num) {
        System.out.println(Integer.toBinaryString(num));
        return Integer.toBinaryString(num);
    }
}
