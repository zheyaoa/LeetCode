package LeetCode;

import java.util.Arrays;
import java.util.Comparator;

public class L179 {
    private class comparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            String order1 = s1 + s2;
            String order2 = s2 + s1;
            return order2.compareTo(order1);
        }
    }

    public String largestNumber(int[] nums) {
        String[] tmp = new String[nums.length];
        Arrays.sort(tmp,new comparator());
        for (int i=0;i<tmp.length;i++){
            tmp[i] = String.valueOf(nums[i]);
        }
        if (tmp[0].equals("0")) return "0";
        StringBuilder result = new StringBuilder("");
        for (int i=0;i<tmp.length;i++){
            result.append(tmp[i]);
        }
        return result.toString();
    }
}
