package LeetCode;

public class L240 {
    public static void main(String[] args){
        int[][] matrix = {{1,1}};
        System.out.println(searchMatrix(matrix,0));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length==0||matrix[0].length ==0) return false;
        int x = 0,y=matrix[0].length-1;
        while (x<=matrix.length-1&&y>=0){
            if (matrix[x][y] == target) return true;
            if (matrix[x][y] > target){
                y--;
            }else {
                x++;
            }
        }
        return false;
    }
}
