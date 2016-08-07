package JZOF;

import java.util.Scanner;
public class WangYi {
    public static void main(String[] args) {
        int MAXDISTANCE=1000;
        Scanner in = new Scanner(System.in);
        String a=in.nextLine();
        int n=in.nextInt();
        int m=in.nextInt();
        String[][] arr=new String[n][m];
        for (int i=0;i<n;n++) {
            arr[i++]=in.nextLine().split("\\s*");
        }
        int x0=in.nextInt();
        int y0=in.nextInt();
        int k=in.nextInt();
        int[][] steps=new int[k][2];
        for (int i=0;i<k;k++) {
            steps[i++][0]=in.nextInt();
            steps[i++][1]=in.nextInt();
        }
        //建立Floyd矩阵
        int[][] floydMatrix=new int[n*m][n*m];
        int row=-1;
        int col=-1;
        for(int i=0;i<n*m;i++){
            for(int j=0;j<n*m;j++){
                floydMatrix[j][i]=MAXDISTANCE;
                floydMatrix[i][j]=MAXDISTANCE;
            }
        }
        for(int i=0;i<n*m;i++){
            row=i/m;
            col=i%m;
            for(int j=0;j<k;j++){
                    int row2=row+steps[k][0];
                    int col2=col+steps[k][1];
                    if(0<=row2 && n>row2) {
                        if (0 <= col2 && m > row2){
                            if (".".equals(arr[row2][col2])) {
                                floydMatrix[i][row2 * m + col2] = 1;
                            }
                        }
                    }
                    row2=row+steps[k][0];
                    col2=col-steps[k][1];
                    if(0<=row2 && n>row2){
                        if (0 <= col2 && m > row2) {
                            if (".".equals(arr[row2][col2])) {
                                floydMatrix[i][row2 * m + col2] = 1;
                            }
                        }
                    }
                    row2=row-steps[k][0];
                    col2=col+steps[k][1];
                    if(0<=row2 && n>row2){
                        if (0 <= col2 && m > row2) {
                            if (".".equals(arr[row2][col2])) {
                                floydMatrix[i][row2 * m + col2] = 1;
                            }
                        }
                    }
                    row2=row-steps[k][0];
                    col2=col-steps[k][1];
                    if(0<=row2 && n>row2){
                        if (0 <= col2 && m > row2) {
                            if (".".equals(arr[row2][col2])) {
                                floydMatrix[i][row2 * m + col2] = 1;
                            }
                        }
                }
            }
            int[][] result=floyd(floydMatrix,m*n);
            int max=0;
            for(int p=0;p<n;p++){
                for(int q=0;q<m;q++){
                    if(".".equals(arr[p][q])){
                        max=result[x0*m+y0][p*m+q];
                    }
                }
            }
            System.out.println(max);
        }
    }

    /**
     *
     * @param G floyd矩阵
     * @param n floyd矩阵大小
     * @return 计算完成的floyd矩阵
     */
    public static int[][] floyd(int[][] G,int n){
        int[][] Dis= new int[n][n];
        for(int q=0;q<n;q++){
            for(int w=0;w<n;w++){
                Dis[q][w]=G[q][w];
            }
        }
        for(int k = 0; k < n; k++){
            for(int i=0; i < n; i++ ){
                for(int j=0; j < n; j++){
                    if(Dis[i][j]>Dis[i][k]+Dis[k][j]){
                        Dis[i][j]=Dis[i][k]+Dis[k][j];
                    }
                }
            }
        }
        return Dis;
    }
}
