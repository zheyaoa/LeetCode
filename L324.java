package LeetCode;

import java.util.Arrays;

public class L324 {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int i =0,size = nums.length;
        int[] smaller = new int[size%2==0?size/2:size/2+1];
        int[] bigger = new int[size/2];
        System.arraycopy(nums,0,smaller,0,smaller.length);
        System.arraycopy(nums,smaller.length,bigger,0,bigger.length);
        for (;i<bigger.length;i++){
            nums[2*i]=smaller[smaller.length-1-i];
            nums[2*i+1]=bigger[nums.length/2-1-i];
        }
        if (size%2!=0) nums[2*i]=smaller[smaller.length-1-i];
    }
}
