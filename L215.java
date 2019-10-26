package LeetCode;

public class L215 {
    public static void main(String[] args){
        System.out.println(findKthLargest(new int[]{7,6,5,4,3,2,1},2));
    }
    public static int findKthLargest(int[] nums, int k) {
        return helper(nums,0,nums.length-1,nums.length-k);
    }
    public static int helper(int[] nums,int left,int right, int target){
        if (left == right) return nums[left];
        int tmp = nums[left];
        int start = left;
        int end = right;
        while (start < end){
            while (nums[end] >= tmp && start < end) end--;
            while (nums[start] <= tmp && start < end) start++;
            swap(nums,start,end);
        }
        swap(nums,start,left);
        if (start == target){
            return nums[target];
        }if (start < target){
            return helper(nums,start+1,right,target);
        }else {
            return helper(nums,left,start-1,target);
        }

    }
    public static void swap(int[] nums,int start,int end){
        int tmp = nums[start];
        nums[start] = nums[end];
        nums[end] = tmp;
    }
}
