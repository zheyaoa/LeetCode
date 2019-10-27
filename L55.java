package LeetCode;

public class L55 {
    public static void main(String[] args){
        int[] nums = new int[]{3,2,1,0,4};
        solution2(nums);
    }
    public boolean canJump(int[] nums) {
        int pos = nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if (i + nums[i] >= pos){
                pos = i;
            }
        }
        return pos == 0;
    }
    public static boolean solution2(int[] nums){
        boolean[] dp = new boolean[nums.length];
        dp[nums.length-1] = true;
        for (int i = nums.length-2;i>=0;i--){
            for (int j=nums[i];j>=0;j--){
                if (i+j<nums.length&&dp[i+j]){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[0] == true;
    }
}
