package LeetCode;

/**
 * Created by chencen on 2016/9/5.
 */
public class Unique_Paths_II63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        if(null==obstacleGrid||0==obstacleGrid.length||0==obstacleGrid[0].length){
            return 0;
        }
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[] matrix=new int[n];
        if(obstacleGrid[0][0]==0) {
            matrix[0] = 1;
        }
        for(int i=1;i<n;i++){
            if(obstacleGrid[0][i]==0) {
                matrix[i] = matrix[i-1];
            }
        }
        for(int i=1;i<m;i++){
            if(obstacleGrid[i][0]==1){
                matrix[0]=0;
            }
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j]==0) {
                    matrix[j] = matrix[j - 1] + matrix[j];
                }else {
                    matrix[j] = 0;
                }
            }
        }
        return matrix[n-1];

    }

    public static void main(String[] args){
        new Unique_Paths_II63().uniquePathsWithObstacles(new int[][]{{0,0}});
    }
}
