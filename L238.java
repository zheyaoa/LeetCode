package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class L238 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = nums.length-1,tmp = 1;i>=0;i--){
            tmp = tmp * nums[i];
            res[i] = tmp;
        }
        for (int i = 0,tmp = 1;i< nums.length;i++){
            if (i > 0){
                tmp *= nums[i-1];
            }
            if (i != nums.length - 1){
                res [i] = tmp * res[i+1];
            }else {
                res[i] = tmp;
            }
        }
        return res;
    }
}
