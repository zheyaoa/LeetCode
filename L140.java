package LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class L140 {
    ArrayList<String> list = new ArrayList<>();
    ArrayList<String> result = new ArrayList<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        helper(s,wordDict,0);
        return result;
}
    public void helper(String s,List<String> wordDict,int start){
        if (start == s.length()){
            StringBuffer tmp = new StringBuffer("");
            for (int i=0;i<list.size()-1;i++){
                tmp.append(list.get(i)+" ");
            }
            tmp.append(list.get(list.size()-1));
            result.add(tmp.toString());
            return;
        }
        for (int end = start+1;end<=s.length();end++){
            list.add(s.substring(start,end));
            if(wordDict.contains(s.substring(start,end))) {
                helper(s, wordDict, end);
            }
            list.remove(list.size()-1);
        }
    }
}
