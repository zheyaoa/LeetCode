package LeetCode;

import java.util.Arrays;

public class L189 {
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,6,7};
        rotate(nums,3);
        System.out.println(1);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return;
        if (nums.length<k) return;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    public static void reverse(int[] nums,int start,int end){
        while (start<end){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
