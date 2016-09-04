package LeetCode;

/**
 * Created by chencen on 2016/9/4.
 */
public class Spiral_Matrix_II59 {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int x1=0,y1=0,x2=n-1,y2=n-1;
        int num=1;
        while(x1<=x2&&y1<=y2){
            for(int i=x1;i<=x2;i++){
                matrix[y1][i]=num++;
            }
            for(int i=y1+1;i<=y2;i++){
                matrix[i][x2]=num++;
            }
            if(y1!=y2){
                for(int i=x2-1;i>=x1;i--){
                    matrix[y2][i]=num++;
                }
            }
            if(x1!=x2){
                for(int i=y2-1;i>y1;i--){
                    matrix[i][x1]=num++;
                }
            }
            x1++;
            x2--;
            y1++;
            y2--;
        }
        return matrix;
    }
    public static void main(String[] args){
        new Spiral_Matrix_II59().generateMatrix(2);
    }
}
