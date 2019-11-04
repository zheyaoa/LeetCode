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
        for (int i=nums.length-2;i>=0;i--){
            for (int j = nums.length-1;j>i;j--){
                if (nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        return Arrays.asList(dp);
    }
}
