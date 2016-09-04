package LeetCode;

/**
 * Created by chencen on 2016/9/5.
 */
public class Unique_Paths62 {
    public int uniquePaths(int m, int n) {
        int[] matrix=new int[n];
        for(int i=0;i<n;i++){
            matrix[i]=1;
        }
        for(int i=1;i<m;i++){
            matrix[0]=1;
            for(int j=1;j<n;j++){
                matrix[j]=matrix[j-1]+matrix[j];
            }
        }
        return matrix[n-1];

    }
}
