package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        List<Integer> list = new ArrayList<>();
        while (node != null || !stack.isEmpty()){
            while (node != null){
                list.add(node.val);
                stack.push(node);
                node = node.left;
            }
            if (!stack.isEmpty()){
                node = stack.pop();
                node = node.right;
            }
        }
        return list;
    }
}
