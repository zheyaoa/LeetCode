package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class L822 {
    public int flipgame(int[] fronts, int[] backs) {
        Map<Integer,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i=0;i<fronts.length;i++){
            if (fronts[i]==backs[i]){
                map.put(fronts[i],backs[i]);
            }
        }
        for (int i=0;i<fronts.length;i++){
            if (!map.containsKey(fronts[i])) {
                min = Math.min(min, fronts[i]);
            }
            if (!map.containsKey(backs[i])) {
                min = Math.min(min, backs[i]);
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}
