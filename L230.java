package LeetCode;

import java.util.Stack;

public class L230 {
    public int kthSmallest(TreeNode root, int k) {
        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<>();
        int sum = 0;
        while (curr != null || !stack.isEmpty()){
            while (curr!=null){
                stack.push(curr);
                curr = curr.left;
            }
            if (!stack.isEmpty()){
                curr = stack.pop();
                if (++sum == k) return curr.val;
                curr = curr.right;
            }
        }
        return 0;
    }
}
