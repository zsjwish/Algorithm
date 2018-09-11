package leetcode;

import java.util.List;

/**
 * created by zsj in 22:26 2018/9/11
 * description: 多叉树
 **/
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
