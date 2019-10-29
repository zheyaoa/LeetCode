package LeetCode;

public class L198 {
    public int rob(int[] nums) {
        int preMax = 0;
        int curMax = 0;
        for (int num:nums){
            int tmp = curMax;
            curMax = Math.max(preMax+tmp,curMax);
            preMax = tmp;
        }
        return curMax;
    }
    public int solution(int[] nums){
        int[] dp = new int[nums.length];
        if (nums.length == 1)return nums[0];
        else if (nums.length == 2) return Math.max(nums[0],nums[1]);
        else {
            dp[0] = nums[0];
            dp[1] = nums[1];
            for (int i=2;i<nums.length;i++){
                dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
            }
            int max = Integer.MIN_VALUE;
            for (int i=0;i<nums.length;i++){
                max = Math.max(max,dp[i]);
            }
            return max;
        }
    }
}
