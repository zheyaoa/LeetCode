package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class L113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList();
        List<Integer> tmp = new ArrayList<>();
        helper(root,sum,tmp,list);
        return list;
    }
    public void helper(TreeNode root, int sum,List<Integer> tmp, List<List<Integer>> list){
        if(root == null) return ;
        tmp.add(root.val);
        sum -= root.val;
        if(root.left == null && root.right == null && sum == 0){
            list.add(new ArrayList<>(tmp));
        }
        helper(root.left,sum,tmp,list);
        helper(root.right,sum,tmp,list);
        tmp.remove(tmp.size()-1);
    }
}
