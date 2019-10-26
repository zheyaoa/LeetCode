package LeetCode;

public class LongestSubStrLength {
    public static void main(String[] args){
        String s1 = "abcd";
        String s2 = "abdde";
        System.out.println(longestSubStrLength(s1,s2));
    }
    public static int longestSubStrLength(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        if (chars1.length == 0||chars2.length == 0){
            return  0;
        }
        int[][] dp = new int[chars1.length+1][chars2.length+1];
        int max = 0;
        for (int i=chars1.length-1;i>=0;i--){
            for (int j=chars2.length-1;j>=0;j--){
                if (chars1[i] == chars2[j]){
                    dp[i][j] = dp[i+1][j+1]+1;
                    max = Math.max(max,dp[i][j]);
                }
            }
        }
        return max;
    }
}
