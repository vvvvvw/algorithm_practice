package LeetCode;

public class Main62 {
    public int uniquePaths(int m, int n) {

/*
        if (null == obstacleGrid || 0 == obstacleGrid.length || 0 == obstacleGrid[0].length) {
            return 0;
        }

        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];

        dp[0][0] = (obstacleGrid[0][0] == 1) ? 0 : 1;
        for (int i = 1; i < obstacleGrid.length; i++) {
            dp[i][0] = ((0==dp[i-1][0])||(obstacleGrid[i][0] == 1)) ? 0 : 1;
        }

        for (int i = 1; i < obstacleGrid[0].length; i++) {
            dp[0][i] =  ((0==dp[0][i-1])||(obstacleGrid[0][i] == 1)) ? 0 : 1;
        }

        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 1; j < obstacleGrid[0].length; j++) {
                dp[i][j] = (obstacleGrid[i][j] == 1)?0:(dp[i-1][j]+dp[i][j-1]);
            }
        }

        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
*/
       return 0;


    }

}
