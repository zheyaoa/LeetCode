package LeetCode;


import java.util.Arrays;
import java.util.Collections;

public class L67 {
        public static void main(String[] args){
            System.out.println(addBinary("11","1"));
        }
        public static String addBinary(String a, String b) {
            if (a.length()<b.length()){
                return  addBinary(b,a);
            }
            char[] chars1 = reverse(a);
            char[] chars2 = reverse(b);
            for (int i=0;i< chars2.length;i++){
                chars1[i] = (char) (((chars1[i] - '0') + (chars2[i] - '0')) + 48);
            }
            System.out.println(Arrays.toString(chars1));
            for (int i=0;i<chars1.length;i++){
                if (chars1[i] >= '2'){
                    chars1[i] = (char) (chars1[i] - 2);
                    if (i == chars1.length-1){
                        return "1"+chars1.toString();
                    }else {
                        chars1[i+1] = (char) (chars1[i+1] - '0' + 1);
                    }
                }
            }
            return  chars1.toString();
        }
        private static char[] reverse(String str){
            char[] chars = str.toCharArray();
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