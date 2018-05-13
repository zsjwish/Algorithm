package leetcode;

import java.util.*;

/**
 * created by zsj in 17:00 2018/5/13
 * description:给定一个列表 accounts，每个元素 accounts[i] 是一个字符串列表，其中第一个元素 accounts[i][0] 是 名称 (name)，其余元素是 emails 表示该帐户的邮箱地址。
 * 现在，我们想合并这些帐户。如果两个帐户都有一些共同的邮件地址，则两个帐户必定属于同一个人。请注意，即使两个帐户具有相同的名称，它们也可能属于不同的人，因为人们可能具有相同的名称。一个人最初可以拥有任意数量的帐户，但其所有帐户都具有相同的名称。
 * 合并帐户后，按以下格式返回帐户：每个帐户的第一个元素是名称，其余元素是按顺序排列的邮箱地址。accounts 本身可以以任意顺序返回。
 *问题：如果多个账号属于同一个人，则他们的用户名一定相同，而用户名相同的不一定是同一个人。需要用邮箱来判断。
 * */
//------------------------error
public class Lee721 {

    public static void main(String[] args) {
        List<List<String>> lists = new LinkedList<>();

        String[][] strs1 = new String[][]{{"John", "johnsmith@mail.com", "john00@mail.com"}, {"John", "johnnybravo@mail.com"}, {"John", "johnsmith@mail.com", "john_newyork@mail.com"}, {"Mary", "mary@mail.com"}};
        String[][] strs2 = new String[][]{{"Kevin","Kevin1@m.co","Kevin5@m.co","Kevin2@m.co"},{"Bob","Bob3@m.co","Bob1@m.co","Bob2@m.co"},{"Lily","Lily3@m.co","Lily2@m.co","Lily0@m.co"},{"Gabe","Gabe2@m.co","Gabe0@m.co","Gabe2@m.co"},{"Kevin","Kevin4@m.co","Kevin3@m.co","Kevin3@m.co"}};
        List<String> list1 = Arrays.asList(strs2[0]);
        List<String> list2 = Arrays.asList(strs2[1]);
        List<String> list3 = Arrays.asList(strs2[2]);
        List<String> list4 = Arrays.asList(strs2[3]);
        List<String> list5 = Arrays.asList(strs2[4]);
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        lists.add(list4);
        lists.add(list5);
        System.out.println(lists);
        Lee721 lee721 = new Lee721();
        lee721.accountsMerge(lists);
    }

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<List<String>, String> map = new HashMap<>();
        for (List<String> tmp : accounts) {
            String name = tmp.get(0);
            List<String> emals = tmp.subList(1, tmp.size());
            emals = uniqueAndSort(emals);
            if (map.isEmpty()) {
                map.put(emals, name);
            }
            else if (map.containsValue(name)) {
                Map<List<String>, String> tmpMap = new HashMap<>(map);
                for (Map.Entry<List<String>,  String> entry : map.entrySet()) {
                    if (entry.getValue().equals(name)) {
                        boolean flag = true;
                        for (String email : emals) {
                            for (String listStr : entry.getKey()) {
                                if (email.equals(listStr)) {
                                    List<String> stringList = new LinkedList<>();
                                    stringList.addAll(emals);
                                    stringList.addAll(entry.getKey());
                                    stringList = uniqueAndSort(stringList);
                                    tmpMap.remove(entry.getKey());
                                    tmpMap.put(stringList, name);
                                    flag = false;
                                    break;
                                }
                            }
                        }
                        if (flag) {
                            tmpMap.put(emals, name);
                        }
                    }
                }
                map = tmpMap;
            }
            else {
                map.put(emals, name);
            }
        }
        System.out.println(map);
        List<List<String>> res = new LinkedList<>();
        for (Map.Entry<List<String>, String> tmp : map.entrySet()) {
            List<String> cur = new LinkedList<>();
            cur.add(tmp.getValue());
            cur.addAll(tmp.getKey());
            res.add(cur);
        }
        System.out.println(res);
        return res;
    }

    public List<String> uniqueAndSort(List<String> list) {
        Set<String> set = new HashSet<>();
        for (String tmp : list) {
            set.add(tmp);
        }
        List<String> res = new LinkedList<>();
        for (String tmp : set) {
            res.add(tmp);
        }
        Collections.sort(res);
        return res;
    }

}
