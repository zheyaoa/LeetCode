package LeetCode;

public class L169 {
    public static void main(String[] args){
        System.out.println(majorityElement(new int[] {3,2,3}));
    }
    public static int majorityElement(int[] nums) {
        int key = nums[0],times = 0;
        for(int i = 0;i<nums.length;i++){
            if(times == 0){
                key = nums[i];
                times ++;
            }else if(key == nums[i]){
                times++;
            }else{
                times--;
            }
        }
        return key;
    }
}
