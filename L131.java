package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L131 {
    public static void main(String[] args){
        String str = "aab";
        partition(str);
    }
    public static List<List<String>> partition(String s) {
        char[]  chars = s.toCharArray();
        int[][] flags = new int[chars.length][chars.length];
        List<List<String>> lists = new ArrayList<>();
        List<String> tmp = new ArrayList<>();
        for (int i=0;i<chars.length;i++){
            helper(chars,0,i,flags,tmp,lists);
        }
        return lists;
    }
    public static void helper(char[] chars,int start,int end,int[][] flags,List<String> tmp,List<List<String>> lists){
        if (flags[start][end] == -1){
            return;
        }else if (flags[start][end] == 0){
            if (isPalindrome(chars,start,end)){
                flags[start][end] = 1;
            }else {
                flags[start][end] = -1;
                return;
            }
        }
        tmp.add(String.valueOf(chars).substring(start,end+1));
        if (end == chars.length-1){
            lists.add(new ArrayList<>(tmp));
        }
        for (int i = end+1;i<chars.length;i++){
            helper(chars,end+1,i,flags,tmp,lists);
        }
        tmp.remove(tmp.size()-1);
    }
    public static boolean isPalindrome(char[] chars,int start,int end){
        while (start<end){
            if (chars[start] != chars[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}
