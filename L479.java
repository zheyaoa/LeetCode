package com.company;

public class L479 {
    public static void main(String[] args){
        System.out.println(largestPalindrome(5));
    }
    public static int largestPalindrome(int n){
        if (n == 1) return 9;
        int min = (int) Math.pow(10,n-1);
        int max = (int)Math.pow(10,n)-1;
        for (int i=max;i>min;i--){
            long tmp = makePalindrome(i);
            int j = max;
            while (tmp/j<=max){
                if (tmp%j == 0){
                    return (int)(tmp%1337);
                }
                j--;
            }
        }
        return 0;
    }
    public static long makePalindrome(int n){
        String str = String.valueOf(n);
        str = str + new StringBuffer(str).reverse().toString();
        return Long.parseLong(str);
    }
}
