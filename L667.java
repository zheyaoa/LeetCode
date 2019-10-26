package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class L667 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(constructArray(3,2)));
    }
    public static int[] constructArray(int n, int k) {
        int[] result = new int[n];
        int l = 1,r=n;
        int i = 0;
        for (;i<k;i++){
            if (i%2 == 0){
                result[i] = l++;
            }else {
                result[i] = r--;
            }
        }
        if(i % 2 == 1){
            for (int j = l; j <= r; j++) result[i++] = j;
        }else{
            for (int j = r; j >= l; j--) result[i++] = j;
        }
        return result;
    }
}
