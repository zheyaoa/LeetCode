package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L17 {
    public static void main(String[] args){
        letterCombinations("23");
    }
    public static List<String> letterCombinations(String digits) {
        String[] strings = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> list = new ArrayList<>();
        char[] chars = digits.toCharArray();
        if (chars.length == 0){
            return list;
        }
        helper(chars,0,strings,new char[chars.length],list);
        return list;
    }
    public static void helper(char[] chars,int index,String[] strings,char[] result,List<String> list){
        if (index == chars.length){
            list.add(String.valueOf(result));
            return;
        }
        int num = chars[index] - '0';
        char[] tmp = strings[num - 2].toCharArray();
        for (int i=0;i<tmp.length;i++){
            result[index] = tmp[i];
            helper(chars,index+1,strings,result,list);
        }
    }
}
