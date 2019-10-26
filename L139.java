package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L139 {
    public static void main(String[] args){
       String s = "leetcode";
       ArrayList<String> wordDict = new ArrayList<String>();
       wordDict.add("leet");
       wordDict.add("code");
       System.out.println(wordBreak(s,wordDict));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] flags = new Boolean[s.length()];
        return helper(s,wordDict,0,flags);
    }
    public static boolean helper(String s,List<String> wordDict,int start,Boolean[] flags){
        if (start == s.length()) return true;
        if (flags[start] != null) return flags[start];
        for (int end = start+1;end<=s.length();end++){
            if (wordDict.contains(s.substring(start,end))&&helper(s,wordDict,end,flags)){
                return flags[start] = true;
            }
        }
        return flags[start] = false;
    }

}
