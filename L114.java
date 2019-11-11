package LeetCode;

import java.util.Stack;

public class L114 {
    public static void flatten(TreeNode root) {
        Helper(root);
    }
    public static TreeNode Helper(TreeNode root){
        if (root == null) return null;
        TreeNode left = Helper(root.left);
        TreeNode right = Helper(root.right);
        root.left = null;
        root.right = left;
        TreeNode last = root;
        while (last.right != null){
            last = last.right;
        }
        last.right = right;
        return root;
    }
}
