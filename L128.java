package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L128 {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int num:nums){
            set.add(num);
        }
        for (int num:nums){
            int tmp = 0,key = num;
            while (set.contains(key)){
                if (map.containsKey(key)){
                    tmp = tmp + map.get(key);
                    break;
                }else {
                    key++;
                    tmp++;
                }
            }
            max = Math.max(max,tmp);
        }
        return max;
    }
}
