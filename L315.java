package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class L315 {
    public static void main(String[] args){
        int[] nums = new int[]{2,0,1};
        countSmaller(nums);
    }
    public static List<Integer> countSmaller(int[] nums) {
        Integer[] dp = new Integer[nums.length];
        int max = Integer.MIN_VALUE;
        for (int i=nums.length-1;i>=0;i--) {
            int tmp = 0;
            if (nums[i] > max){
                max = nums[i];
                tmp = nums.length-1-i;
            }else {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] > nums[j]) {
                        tmp = dp[j] + 1;
                        break;
                    }
                }
            }
            dp[i] = tmp;
        }
        List<Integer> result = Arrays.asList(dp);
        return result;
    }
}
