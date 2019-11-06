package LeetCode;

public class L329 {
     int[][] ans = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
     int m,n;
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0)return 0;
        m = matrix.length; n = matrix[0].length;
        int cache[][] = new int[m][n];
        int result = 0;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                result = Math.max(result,DFS(matrix,i,j,cache));
            }
        }
        return result;
    }
    public int DFS(int[][] matrix,int i,int j,int[][] cache){
        if (i<0||i>=m||j<0||j>=m) return 0;
        if (cache[i][j] != 0) return cache[i][j];
        for (int[] d:ans){
            int x = i+d[0]; int y = j + d[1];
            if (matrix[x][y] > matrix[i][j]){
                cache[i][j] = Math.max(cache[i][j],DFS(matrix, x, y, cache));
            }
        }
        return ++cache[i][j];
    }
}
