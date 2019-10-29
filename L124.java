package LeetCode;

public class L124 {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        DFS(root);
        return max;
    }
    public int DFS(TreeNode root){
        if (root == null) return 0;
        int left = Math.max(DFS(root.left),0);
        int right = Math.max(DFS(root.right),0);
        int mid = root.val;
        int sum = mid + left + right;
        max = Math.max(max,sum);
        return mid + Math.max(left,right);
    }
}
