package niuke;

import java.util.Scanner;

/**
 * Created by chencen on 2016/8/9.
 */
public class ShortestSort {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int right=0;
        int left=n-1;
        for(int i=0;i<n;i++){
            if(arr[i]<max){
                right=i;
            }else if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]>min){
                left=i;
            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(left>=right?0:right-left+1);
    }
}
