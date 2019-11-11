package LeetCode;

import java.util.Arrays;

public class L416 {
    public static void main(String[] args){
        canPartition(new int[]{1,5,5,11});
    }
    public static boolean canPartition(int[] nums) {
        int target = 0;
        for (int i=0;i<nums.length;i++){
            target += nums[i];
        }
        if (target%2 == 1) return false;
        int[] dp = new int[target+1];
        Arrays.fill(dp,Integer.MIN_VALUE);
        dp[0] = 0;
        for (int i=0;i<nums.length;i++){
            for (int j=target;j>=nums[i];j--){
                dp[j] = Math.max(dp[j],dp[j - nums[i]]+nums[i]);
            }
        }
        return dp[target/2] > 0;
    }
}
