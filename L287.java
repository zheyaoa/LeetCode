package LeetCode;

public class L287 {
    public int findDuplicate(int[] nums) {
        int fast = nums[0];
        int low = nums[0];
        do {
            fast=nums[nums[fast]];
            low = nums[low];
        }while (fast!=low);
        int tmp = nums[0];
        while (tmp != low){
            tmp = nums[tmp];
            low = nums[low];
        }
        return tmp;
    }
}
