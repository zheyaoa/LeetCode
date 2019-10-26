package LeetCode;

public class L344 {
    public void reverseString(char[] s) {
        int start = 0,end = s.length-1;
        char c;
        while (start<end){
            c = s[start];
            s[start] = s[end];
            s[end] = c;
            start ++;
            end--;
        }
    }
}
