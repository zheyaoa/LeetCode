package LeetCode;

import java.util.Arrays;

public class L66 {
    public static void main(String[] args){
        int[] a = {9,9,9};
        System.out.println(Arrays.toString(plusOne(a)));
    }

    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            digits[i]++;
            if(digits[i]<10){
                return digits;
            }else{
                digits[i] = 0;
                if(i==0){
                    int[] rs = new int[digits.length+1];
                    rs[0] = 1;
                    for(int j=1;j<digits.length;j++){
                        rs[j] = digits[j-1];
                    }
                    return rs;
                }
            }
        }
        return digits;
    }
}
