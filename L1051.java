package LeetCode;

public class L1051 {
    public static void main(String[] args){
        int[] height = {1,1,4,2,1,3};
        System.out.println(heightChecker(height));
    }
    public static int heightChecker(int[] heights) {
        int[] flags = new int[101];
        int count = 0;
        for (int i=0;i<heights.length;i++){
            flags[heights[i]]++;
        }
        for (int i=0,j=0;i<flags.length;i++){
            while (flags[i]!=0){
                if (heights[j++] != i) count++;
                flags[i]--;
            }
        }
        return count;
    }
}
