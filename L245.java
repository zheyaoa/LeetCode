package LeetCode;

import java.util.Stack;

public class L245 {
    TreeNode result = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        DFS(root, p, q);
        return result;
    }
    public boolean DFS(TreeNode root,TreeNode p,TreeNode q){
        if (root == null) return false;
        int left = DFS(root.left,p,q)?1:0;
        int mid = (root == p||root == q)?1:0;
        int right = DFS(root.right,p,q)?1:0;
        if (left + mid + right >= 2){
            result = root;
        }
        return left + mid + right >0;
    }
}
