package LeetCode;

import java.util.Arrays;

public class L322 {
    public static void main(String[] args){
        coinChange(new int[]{2},3);
    }
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for (int coin:coins){
            for (int i=coin;i<=amount;i++){
                dp[i] = Math.min(dp[i-coin]+1,dp[i]);
            }
        }
        return dp[amount] == (amount+1)?-1:dp[amount];
    }
}
