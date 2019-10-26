package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L454 {
    public static void main(String[] args){
        fourSumCount(new int[]{-1,-1},new int[]{-1,1},new int[]{-1,1},new int[]{1,-1});
        }
    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for (int a:A){
            for (int b:B){
                int key = (a+b)*-1;
                if (!map.containsKey(key)){
                    map.put(key,1);
                }else {
                    map.put(key,map.get(key)+1);
                }
            }
        }
        for (int c:C){
            for (int d:D){
                if (map.containsKey(c+d)){
                    count+=map.get(c+d);
                }
            }
        }
        return count;
    }
}
