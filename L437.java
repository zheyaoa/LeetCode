package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class L437 {

    public int pathSum(TreeNode root, int sum) {
        if (root == null) return  0;
        return pathSum(root.left,sum)+pathSum(root.right,sum)+help(root,sum);
    }
    public int help(TreeNode root,int sum){
        if (root == null) return 0;
        int res = 0;
        if (root.val == sum) res++;
        res += help(root.left,sum-root.val);
        res += help(root.right,sum-root.val);
        return res;
    }
}
