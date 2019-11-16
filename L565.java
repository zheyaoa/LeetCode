package LeetCode;

public class L565 {
    public int arrayNesting(int[] nums) {
        boolean[] visted =  new boolean[nums.length];
        int max = 0;
        for (int i=0;i<nums.length;i++){
            if (!visted[i]){
                int start = nums[i];
                int count = 0;
                do{
                    start = nums[start];
                    count++;
                    visted[start] = true;
                }while (start != nums[i]);
                max = Math.max(max,count);
            }
        }
        return max;
    }
}
