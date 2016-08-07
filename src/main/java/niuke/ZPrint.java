package niuke;

import java.util.Scanner;

/**
 * Created by chencen on 2016/8/5.
 */
public class ZPrint {
    private static void printZ(int[][] matrix,int x,int y,int n){
       while(x>=0&&y<n){
           System.out.print(matrix[y++][x--]);
        }
    }
    public static void printMatrix(){
        Scanner scanner=new Scanner(System.in);
        int n;
        int m;
        n=scanner.nextInt();
        m=scanner.nextInt();
        int[][] matrix=new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++){
                matrix[i][j]=scanner.nextInt();
            }
        int x=0,y=0;
        while(x<m&&y<n){
            printZ(matrix,x,y,n);
            if(x+1>=m){
                y++;
            }else{
                x++;
            }
        }
    }
    public static void main(String[] args){
        printMatrix();
    }
}
