package LeetCode;

public class L1052 {
    public static void main(String[] args){
        System.out.println(maxSatisfied(new int[] {3,2,5},new int[]{0,1,1},2));
    }
    public static int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int sum = 0,max = 0,tmp=0;
        for (int i=0;i<customers.length;i++){
            if (grumpy[i] == 0){
                sum += customers[i];
                customers[i] = 0;
            }
        }
        for (int i=0;i<customers.length;i++){
            if (i<X){
                max = max + customers[i];
                tmp = max;
            }else {
                tmp = tmp+customers[i]-customers[i-X];
                max = Math.max(tmp,max);
            }
        }
        return max + sum;
    }
}
