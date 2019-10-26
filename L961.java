package LeetCode;

public class L961 {
    public int repeatedNTimes(int[] A) {
        for (int i=0;i<A.length-1;i++){
            if (A[i] == A[i+1]) return  A[i];
        }
        if (A[0] == A[1] || A[0] == A[2] || A[0] == A[3]) return A[0];
        if (A[1] == A[2] || A[1] == A[3]) return A[1];
        return A[2];
    }
}
