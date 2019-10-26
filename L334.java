package LeetCode;

public class L334 {
    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;
        for (int i = 0;i<nums.length;i++){
            if(nums[i] < small){
                small = nums[i];
            }else if (nums[i]>small&&nums[i] < max){
                max = nums[i];
            }else if (nums[i] > max){
                return true;
            }
        }
        return false;
    }
}
