package LeetCode;


public class L111 {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left != null && root.right != null){
            return 1 + Math.min(minDepth(root.right),minDepth(root.left));
        }
        return 1 + Math.max(minDepth(root.right),minDepth(root.left));
    }
}

