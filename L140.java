package LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class L140 {
    HashMap<Integer,List<String>> map = new HashMap<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        return Helper(s,wordDict,0);
    }
    public List<String> Helper(String s,List<String> wordDict,int start){
        if (map.containsKey(start)){
            return map.get(start);
        }
        LinkedList<String> res = new LinkedList<>();
        if (start == s.length()){
            res.add("");
        }
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end))) {
                List<String> list = Helper(s, wordDict, end);
                for (String l : list) {
                    res.add(s.substring(start, end) + (l.equals("") ? "" : " ") + l);
                }
            }
        }
        map.put(start,res);
        return res;
    }
}
