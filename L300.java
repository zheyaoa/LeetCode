package LeetCode;

import java.util.Arrays;

public class L300 {
    public int lengthOfLIS(int[] nums) {
        if (nums.length<=1) return nums.length;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);

        int max = Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<i;j++){
                if (nums[i]>nums[j]){
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                }
                max = Math.max(max,dp[i]);
            }
        }

        return max;
    }
}
