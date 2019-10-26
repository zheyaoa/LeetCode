package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L350 {
    public static void main(String[] args){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {1,1};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<nums1.length;i++){
            if (!map.containsKey(nums1[i])){
                map.put(nums1[i],1);
            }else {
                map.put(nums1[i],map.get(nums1[i])+1);
            }
        }
        for (int i = 0;i<nums2.length;i++){
            if (map.containsKey(nums2[i])){
                list.add(nums2[i]);
                int value = map.get(nums2[i]) - 1;
                if (value == 0){
                    map.remove(nums2[i]);
                }else {
                    map.put(nums2[i],value);
                }
            }
        }
        Integer[] res = list.toArray(new Integer[list.size()]);
        return Arrays.stream(res).mapToInt(Integer::valueOf).toArray();
    }
}
