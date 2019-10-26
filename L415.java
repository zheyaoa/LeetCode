package LeetCode;

import java.util.Scanner;

public class L415 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(addStrings(s1,s2));
    }
    public static String addStrings(String s1,String s2){
        if (s1.length() < s2.length()){
            return addStrings(s2,s1);
        }
        char[] c1 = reverse(s1.toCharArray());
        char[] c2 = reverse(s2.toCharArray());
        for (int i=0;i<c2.length;i++){
            c1[i] = (char) (c1[i] - '0'  + c2[i] - '0' + 48);
        }
        for (int i=0;i<c1.length;i++){
            if(c1[i] - '0' >= 10){
                c1[i] = (char) (c1[i] - 10);
                if(i == c1.length -1){
                    char[] rs = new char[c1.length+1];
                    for (int j=0;j<c1.length;j++){
                        rs[j] = c1[j];
                    }
                    rs[rs.length-1] = '1';
                    return  String.valueOf(reverse(rs));
                }
                c1[i+1] = (char)(c1[i+1] - '0' + 1 + 48);
            }
        }
        return String.valueOf(reverse(c1));
    }
    public static char[] reverse(char[] chars){
        int start = 0;
        int end = chars.length-1;
        while (start<end){
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start++;
            end--;
        }
        return chars;
    }
}
