package LeetCode;

public class L387 {
    public static void main(String[] args){

    }
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int[] flags = new int[26];
        int i;
        for (i=0;i<chars.length;i++){
            char c = chars[i];
            flags[c - 'a']++;
        }
        for (i=0;i<chars.length;i++){
            char c = chars[i];
            if (flags[c - 'a']==1) return i;
        }
        return  -1;
    }
}
