package LeetCode;

public class L283 {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i] == 0){
                count++;
                continue;
            }
            if (count != 0){
                int tmp = nums[i-count];
                nums[i-count] = nums[i];
                nums[i] = tmp;
            }
        }
    }
}