package LeetCode;

public class L1005 {
    public static void main(String[] args){
        int[] arr = {2,-3,-1,5,-4};
        System.out.println(largestSumAfterKNegations(arr,2));
    }
    public static int largestSumAfterKNegations(int[] A, int K) {
        if (A.length == 0) return 0;
        while (K!=0){
            int tmp = getMinIndex(A);
            A[tmp] *= -1;
            K--;
        }
        int sum = 0;
        for (int i=0;i<A.length;i++){
            sum+= A[i];
        }
        return sum;
    }
    public static int getMinIndex(int[] nums){
        int min = nums[0];
        int minIndex = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]<min){
                min = nums[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
