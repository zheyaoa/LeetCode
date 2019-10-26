package LeetCode;

public class L121 {
    public static void main(String[] args){
        int[] test = {7,6,4,3,1};
        System.out.println(maxProfit(test));
    }
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int result = 0;
        int small = prices[0];
        for (int i = 0;i<prices.length;i++){
            result = Math.max(result,prices[i]-small);
            small = Math.min(small,prices[i]);
        }
        return result;
    }
}
