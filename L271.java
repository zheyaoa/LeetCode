package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class L271 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }
}
