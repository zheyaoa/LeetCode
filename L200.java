package LeetCode;

public class L200 {

    int count = 0;
    public int numIslands(char[][] grid) {
        int m = grid.length;
        if (m == 0) return count;
        int n = grid[0].length;
        boolean[][] flags = new boolean[m][n];
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if (flags[i][j]) continue;
                if (grid[i][j] == '0'){
                    flags[i][j] = true;
                }else {
                    count++;
                    findIsLand(grid, m, n, flags, i, j);
                }
            }
        }
        return count;
    }
    public void findIsLand(char[][] grid,int m,int n,boolean[][] flags,int i,int j){
        if (i<0||i>=m||j<0||j>=n||flags[i][j]) return;
        flags[i][j] = true;
        if (grid[i][j] == '1'){
            findIsLand(grid, m, n, flags, i+1, j);
            findIsLand(grid, m, n, flags, i-1, j);
            findIsLand(grid, m, n, flags, i, j+1);
            findIsLand(grid, m, n, flags, i, j-1);
        }
    }
}
