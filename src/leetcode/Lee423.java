package leetcode;

/**
 * created by zsj in 13:06 2018/5/17
 * description:给定一个非空字符串，其中包含字母顺序打乱的英文单词表示的数字0-9。按升序输出原始的数字。
 * 通过分析字母，发现有的字母只属于一个数字，比如z只有0里面有，所以在不考虑出错的情况下可以采用这种方式
 **/
public class Lee423 {
    public static void main(String[] args) {
        Lee423 lee423 = new Lee423();
        lee423.originalDigits("seven");
    }
    public String originalDigits(String s) {
        int[] res = new int[10];
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            switch (tmp) {
                case 'z':
                    res[0]++;
                    break;
                case 'w':
                    res[2]++;
                    break;
                case 'u':
                    res[4]++;
                    break;
                case 'x':
                    res[6]++;
                    break;
                case 'g':
                    res[8]++;
                    break;
                case 's':
                    res[7]++;
                    break;
                case 'n':
                    res[1]++;
                    break;
                case 'f':
                    res[5]++;
                    break;
                case 'h':
                    res[3]++;
                    break;
                case 'i':
                    res[9]++;
                    break;
            }
        }
        res[3] -= res[8];
        res[5] -= res[4];
        res[7] -= res[6];
        res[9] -= res[5] + res[6] + res[8];
        res[1] -= res[9]*2 + res[7];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i]; j++) {
                sb.append(i);
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

}
