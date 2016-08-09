package niuke;

import java.util.Scanner;

/**
 * Created by chencen on 2016/8/9.
 */
public class LocalSmallest {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        if(arr.length==1){
            System.out.println(arr[0]);
        }else if(arr[0]<arr[1]){
            System.out.println(arr[0]);
            return;
        }else if(arr[n-1]<arr[n-2]){
            System.out.println(arr[n-1]);
            return;
        }
        int left=1;
        int right=n-2;
        int mid;
        while(left<=right){
            mid=(left+right)/2;
            if(arr[mid]<arr[mid-1]&&arr[mid]<arr[mid+1]){
                System.out.println(arr[mid]);
                return;
            }else if(arr[mid]>arr[mid-1]){
                right=mid-1;
                continue;
            }else if(arr[mid]<arr[mid+1]){
                left=mid+1;
                continue;
            }
        }
        return;
    }
}
