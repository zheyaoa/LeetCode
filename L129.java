package LeetCode;

public class L129 {
    int sum = 0;
    public  int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root, root.val);
        return sum;
    }
    private void dfs(TreeNode root, int cursum) {
        //到达叶子节点
        if (root.left == null && root.right == null) {
            sum += cursum;
            return;
        }
        //尝试左子树
        if(root.left!=null){
            dfs(root.left,  cursum * 10 + root.left.val);
        }
        //尝试右子树
        if(root.right!=null){
            dfs(root.right, cursum * 10 + root.right.val);

        }

    }

}
