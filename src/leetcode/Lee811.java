package leetcode;

import java.util.*;

/**
 * created by zsj in 20:33 2018/5/22
 * description:一个网站域名，如"discuss.leetcode.com"，包含了多个子域名。
 * 作为顶级域名，常用的有"com"，下一级则有"leetcode.com"，最低的一级为"discuss.leetcode.com"。
 * 当我们访问域名"discuss.leetcode.com"时，也同时访问了其父域名"leetcode.com"以及顶级域名 "com"。
 * 给定一个带访问次数和域名的组合，要求分别计算每个域名被访问的次数。
 * 其格式为访问次数+空格+地址，例如："9001 discuss.leetcode.com"。
 * 接下来会给出一组访问次数和域名组合的列表cpdomains 。
 * 要求解析出所有域名的访问次数，输出格式和输入格式相同，不限定先后顺序。
 **/
public class Lee811 {

    public static void main(String[] args) {
        Lee811 lee811 = new Lee811();
        String[] strings = new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        lee811.subdomainVisits(strings);
        String[] tmp = strings[0].split("\\.");
//        System.out.println(Arrays.toString(tmp));
    }

    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> res = new LinkedList<>();
        if (cpdomains == null || cpdomains.length == 0) {
            return res;
        }
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < cpdomains.length; i++) {
            String[] sp1 = cpdomains[i].split(" ");
            int num = Integer.valueOf(sp1[0]);
            String[] sp2 = sp1[1].split("\\.");
            for (int j = 0; j < sp2.length; j++) {
                StringBuilder sb = new StringBuilder();
                for (int k = j; k < sp2.length; k++) {
                    sb.append(sp2[k]);
                    sb.append(".");
                }
                sb.deleteCharAt(sb.length()-1);
                if (map.containsKey(sb.toString())) {
                    map.put(sb.toString(),map.get(sb.toString()) + num);
                }
                else {
                    map.put(sb.toString(), num);
                }
            }
        }
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(e.getValue());
            sb.append(" ");
            sb.append(e.getKey());
            res.add(sb.toString());
        }
        System.out.println(res);
        return res;
    }

}
