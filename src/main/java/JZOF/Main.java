package JZOF;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by chencen on 2016/8/17.
 */
public class Main {
    public static int[] suffle(int[] arr,int n){
        int[] res=new int[2*n];
        for(int i=0;i<n;i++){
         res[2*i]=arr[i];
         res[2*i+1]=arr[n+i];
        }
        return res;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        int[][] arr=new int[t][];
        int[] n=new int[t];
        int[] k=new int[t];
        for(int i=0;i<t;i++){
            n[i]=scanner.nextInt();
            k[i]=scanner.nextInt();
            arr[i]=new int[2*n[i]];
            for(int j=0;j<2*n[i];j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        int[] res=null;
        for(int i=0;i<t;i++){
            res=arr[i];
            for(int j=0;j<k[i];j++){
                res=suffle(res,n[i]);
            }
            for(int m=0;m<2*n[i];m++){
                if(m==2*n[i]-1){
                    System.out.println(res[m]);
                }else {
                    System.out.print(res[m] + " ");
                }
            }
        }


    }
}
