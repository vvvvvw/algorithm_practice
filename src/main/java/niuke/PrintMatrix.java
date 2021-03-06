package niuke;

import org.junit.Test;

import java.util.Scanner;

/**
 * Created by chencen on 2016/8/5.
 */
public class PrintMatrix {
        private static void printSquare(int[][] matrix,int x1,int y1,int x2,int y2){
            for(int i=x1;i<=x2;i++){
                System.out.print(matrix[y1][i]+" ");
            }
            for(int i=y1+1;i<=y2;i++){
                System.out.print(matrix[i][x2]+" ");
            }
            if(y1!=y2) { //重点:当只有一行或者一列时，会重复打印
                for (int i = x2 - 1; i >= x1; i--) {
                    System.out.print(matrix[y2][i] + " ");
                }
            }
            if(x1!=x2) {
                for (int i = y2 - 1; i > y1; i--) {
                    System.out.print(matrix[i][x1] + " ");
                }
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
            int x1=0,y1=0,x2=m-1,y2=n-1;
            while(x1<=x2&&y1<=y2){
                printSquare(matrix,x1,y1,x2,y2);
                x1++;
                x2--;
                y1++;
                y2--;
            }
        }
    public static void main(String[] args){
        printMatrix();
    }
}
