package LeetCode;

import java.util.Arrays;

public class L748 {
    public static void main(String[] args){
        System.out.println(        shortestCompletingWord("1s3 PSt" ,new String[]{"step","steps","stripe","stepple"}));
    }
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        int flags[] = new int[26];
        String result = null;
        for (int i=0;i<licensePlate.length();i++){
            char c = licensePlate.charAt(i);
            if ('a'<= c && c <= 'z'){
                flags[c - 'a']+=1;
            }else if ('A' <= c && c <= 'Z'){
                flags[c - 'A']+=1;
            }
        }
        OUT:
        for (int i = 0;i<words.length;i++){
            int[] temp = Arrays.copyOf(flags,26);
            String string = words[i];
            for (int j=0;j<string.length();j++){
                char c = string.charAt(j);
                if (temp[c - 'a']>0) temp[c - 'a']--;
            }
            for (int j=0;j<26;j++){
                if (temp[j] != 0) continue OUT;
            }
            if (result == null || result.length()>string.length()){
                result = string;
            }
        }
        return result;
    }
}
