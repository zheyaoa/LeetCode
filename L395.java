package LeetCode;

public class L395 {
    public static void main(String[] args){
        System.out.println(longestSubstring("ababbc",2));
    }
    public static int longestSubstring(String s, int k) {
        return helper(s.toCharArray(),k,0,s.length());
    }
    public static int helper(char[] chars,int k,int start,int end){
        if (end-start<k){
            return 0;
        }
        int i;
        int[] flags = new int[26];
        for (i=start;i<end;i++){
            flags[chars[i] - 'a']++;
        }
        for (i=start;i<end;i++){
            if (flags[chars[i] - 'a'] < k){
                return Math.max(helper(chars,k,start,i),helper(chars,k,i+1,end));
            }
        }
        return end-start;
    }
}
