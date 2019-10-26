package LeetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class L145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new LinkedList<>();
        TreeNode node = root;
        TreeNode lastVisted = root;
        while (node != null || !stack.isEmpty()){
            while (node != null){
                stack.push(node);
                node = node.left;
            }
            node = stack.peek();
            if (node.right == null || node.right == lastVisted){
                list.add(node.val);
                stack.pop();
                lastVisted = node;
                node = null;
            }else {
                node = node.right;
            }
        }
        return  list;
    }
}
