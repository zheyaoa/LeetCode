package LeetCode;

import java.util.Arrays;

public class L1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        int res = 0;
        int flags[] = new int[81];
        for (int i = 0;i<dominoes.length;i++){
            Arrays.sort(dominoes[i]);
            flags[dominoes[i][0]*9+dominoes[i][1]]++;
        }
        for (int i = 0;i<flags.length;i++){
            if (flags[i]>=2){
                res += flags[i]*(flags[i]-1)/2;
            }
        }
        return res;
    }
}
