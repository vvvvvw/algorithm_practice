package niuke;

import java.util.Scanner;

/**
 * Created by chencen on 2016/8/9.
 */
public class MaxDiffBetweenLeftAndRight {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int min=Math.min(arr[0],arr[n-1]);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }
        System.out.println(max-min);
    }
}
