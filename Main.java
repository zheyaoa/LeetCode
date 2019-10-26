package LeetCode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String s = "aa";
        ArrayList<String> wordDict = new ArrayList<String>();
        wordDict.add("a");
        wordDict.add("aa");
        System.out.println(new L140().wordBreak(s,wordDict));
    }
}
