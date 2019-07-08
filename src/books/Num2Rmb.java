package books;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

/**
 * created by zsj in 17:13 2019/7/8
 * description:
 **/
public class Num2Rmb {
    private String[] hanArr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    private String[] unitArr = {"十","百","千"};
    private String[] unit4Arr = {"万","亿"};
    public String toHanArr(String number) {
        StringBuffer hanString = new StringBuffer();
        String[] res = number.split("\\.");
        String integer = res[0];
        String decimal = res[1];
        hanString.append(integerToHan(integer));
        hanString.append(decimalToHan(decimal));
        return hanString.toString();
    }

    private String integerToHan(String integer) {
        StringBuffer res = new StringBuffer();
        String[] tmp = new String[(integer.length() - 1) / 4 + 1];
        for (int i = integer.length(); i > 0; i = i - 4) {
            tmp[(i - 1) / 4 > 0?(i - 1) / 4 : 0] = integer.substring(i-4>0?i-4:0, i);
        }
        for (int i = 0; i < tmp.length; i++) {
            res.append(integer4ToHan(tmp[i]));
            if (res.charAt(res.length()-1) != '零' && i != tmp.length - 1) {
                res.append(unit4Arr[tmp.length - i - 2]);
            }
        }
        return res.toString();
    }

    private String integer4ToHan(String integer){
        StringBuilder sb = new StringBuilder();
        int length = integer.length();
        for (int i = 0; i < length; i++) {
            int num = integer.charAt(i) - '0';
            if (i!=length - 1 && num != 0) {
                sb.append(hanArr[num] + unitArr[length - 2 - i]);
            }
            else if (num == 0 && sb.length() != 0 && sb.charAt(sb.length() - 1)=='零'){
                continue;
            }
            else {
                sb.append((hanArr[num]));
            }
        }
        if (sb.charAt(sb.length() - 1) == '零' && sb.length() != 1){
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    private String decimalToHan(String decimal) {
        StringBuilder res = new StringBuilder("点");
        for(int i = 0; i < decimal.length() && i < 2; i++){
            res.append(hanArr[decimal.charAt(i) - '0']);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Num2Rmb num2Rmb = new Num2Rmb();
//        System.out.println(num2Rmb.decimalToHan("1215322413"));
//        System.out.println(num2Rmb.integerToHan("46"));
//        System.out.println(num2Rmb.integer4ToHan("1598"));
        System.out.println(num2Rmb.toHanArr("1030000001.1234"));
    }
}
