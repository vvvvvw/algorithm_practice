package JZOF;

public class Main14 {

/*
    public int cuttingRope(int n) {
        int[][] maxMatrix = new int[n+1][n+1];

        for (int i = 1; i < n+1; i++) {
            maxMatrix[i][1] = i;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 2; i < n+1; i++) {
            for (int j = 2; j < n + 1; j++) {
                maxMatrix[i][j] = max(maxMatrix,i,j);
                if(max<maxMatrix[i][j]){
                    max = maxMatrix[i][j];
                }
            }
        }

        return max;
    }

    private int max(int[][] maxMatrix, int i, int j) {
        int res = Integer.MIN_VALUE;

        for (int k = j-1; k < i; k++) {
            res = Math.max(maxMatrix[k][j-1]*(i-k),res);
        }

        return res;
    }
*/
public static int cuttingRope(int n) {
    if(n<=2){
        return 1;
    }
    if(3==n){
        return 2;
    }
    int[] dp = new int[n+1];
    dp[1] = 1;
    dp[2] = 2;
    dp[3] = 3;

    for (int i = 4; i <= n; i++) {
        dp[i] = Integer.MIN_VALUE;
        for (int j = 1; j < i ; j++) {
            dp[i] = Math.max(dp[j]*(i-j),dp[i]);
        }
    }

    return dp[n]%1000000007;
}

    public static void main(String[] args) {
        System.out.println(cuttingRope(6));
    }


}
