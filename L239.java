package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class L239 {
    public static void main(String[] args){
        int[] nums = {7,2,4};
        maxSlidingWindow(nums,2);
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length==0) return new int[0];
        int index = 0;
        LinkedList<Integer> qmax = new LinkedList();
        int[] res = new int[nums.length-k+1];
        for (int i = 0;i<nums.length;i++){
            while(!qmax.isEmpty()&&nums[qmax.peekLast()] < nums[i]){
                qmax.pollLast();
            }
            qmax.addLast(i);
            if (qmax.peekFirst() == i - k) {
                qmax.pollFirst();
            }
            if (i >= k - 1) {
                res[index++] = nums[qmax.peekFirst()];
            }
        }
        return res;
    }
}
