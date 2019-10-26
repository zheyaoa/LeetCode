package LeetCode;

public class L112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        return helper(root,sum,0);

    }
    public boolean helper(TreeNode root, int sum,int count){
        if(root == null) return false;
        if(root.left == null && root.right == null) return count + root.val == sum;
        return helper(root.left,sum,count+root.val)||helper(root.right,sum,count+root.val);

    }
}
