package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class L46 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> tmp = new ArrayList<>();
    boolean[] flags;
    public List<List<Integer>> permute(int[] nums) {
        flags = new boolean[nums.length];
        Helper(nums);
        return result;
    }
    public void Helper(int[] nums){
        int size = nums.length;

        for (int i=0;i<size;i++){
            if (!flags[i]){
                tmp.add(nums[i]);
                flags[i] = true;
                if (tmp.size() == size){
                    result.add(new ArrayList<Integer>(tmp));
                }
                Helper(nums);
                flags[i] = false;
                tmp.remove(tmp.size()-1);
            }
        }
    }

}
