package leetcode;

import java.util.*;

/**
 * created by zsj in 10:36 2018/5/23
 * description:给定一个保存员工信息的数据结构，它包含了员工唯一的id，重要度 和 直系下属的id。
 * 比如，员工1是员工2的领导，员工2是员工3的领导。他们相应的重要度为15, 10, 5。
 * 那么员工1的数据结构是[1, 15, [2]]，员工2的数据结构是[2, 10, [3]]，员工3的数据结构是[3, 5, []]。
 * 注意虽然员工3也是员工1的一个下属，但是由于并不是直系下属，因此没有体现在员工1的数据结构中。
 * 现在输入一个公司的所有员工信息，以及单个员工id，返回这个员工和他所有下属的重要度之和。
 * [[1,5,[2,3]],[2,3,[4]],[3,4,[]],[4,1,[]]]  1
 **/
public class Lee690 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,5, Arrays.asList(new Integer[]{2,3}));
        Employee e2 = new Employee(2,3, Arrays.asList(new Integer[]{4}));
        Employee e3 = new Employee(3,4, Arrays.asList(new Integer[]{}));
        Employee e4 = new Employee(4,1, Arrays.asList(new Integer[]{}));
        Lee690 lee690 = new Lee690();

        lee690.getImportance(Arrays.asList(new Employee[] {e1,e2,e3,e4}), 1);
    }
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, List<Integer>> sub = new HashMap<>();
        Employee target = new Employee();
        for (Employee tmp : employees) {
            map.put(tmp.id, tmp.importance);
            sub.put(tmp.id, tmp.subordinates);
            if (tmp.id == id) {
                target = tmp;
            }
        }
        int res = target.importance;
        List<Integer> list = new LinkedList<>();
        list.addAll(target.subordinates);
        while (!list.isEmpty()) {
            for (int i = list.size() - 1; i >= 0; i--) {
                res += map.get(list.get(i));
                list.addAll(sub.get(list.get(i)));
                list.remove(i);
            }
        }
        System.out.println(res);
        return res;
    }
}
class Employee {
    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }
    public Employee() {

    }
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
}