package LeetCode;

import java.util.Random;

public class L384 {
    int[] nums;
    public L384(int[] nums){
        this.nums = nums;
    }
    public int[] reset() {
        return this.nums;
    }
    public int[] shuffle() {
        Random rand = new Random();
        int[] copy = new int[nums.length];
        for (int i=0;i<copy.length;i++){
            copy[i] = nums[i];
        }
        for (int i=copy.length-1;i>0;i--){
            int random = rand.nextInt(i);
            swap(copy,i,random);
        }
        return copy;
    }
    public void swap(int[] nums,int i,int j){
        int tmp =  nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
