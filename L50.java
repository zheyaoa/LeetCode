package LeetCode;

public class L50 {
    public static void main(String[] args){
        System.out.println(myPow(2, 10));
    }
    public static double myPow(double x, int n) {
        if (x == -1) {
            if ((n & 1) != 0) {
                return -1;
            } else {
                return 1;
            }
        }
        if (x == 1.0f)
            return 1;

        if (n == -2147483648) {
            return 0;
        }

        if (n < 0) return 1/myPow(x,-n);
        if (n == 0) return 1;
        if (n % 2 ==0){
            return myPow(x*x,n/2);
        }else {
            return myPow(x*x,n/2)*x;
        }
    }
}
