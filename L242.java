package LeetCode;

public class L242 {
    public static void main(String[] args){
        System.out.println(isAnagram("aacc","ccac"));
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] flags = new int[26];
        int i;
        for (i=0;i<s.length();i++) flags[s.charAt(i)- 'a']++;
        for (i=0;i<t.length();i++){
            if (flags[t.charAt(i) - 'a']--==0){
                return false;
            }
        }
        return true;
    }
}
