package niuke;

import java.util.Scanner;

/**
 * Created by 陈钻健 on 2016/8/10.
 */
public class FindKstWith2Arrs {
    public static int findMedianWith2Arrs(){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=scanner.nextInt();
        }
        int left1=0,left2=0;
        int mid1,mid2;
        int right1=n-1,right2=n-1;
        int len=n;
        while(len>=1){
            if(len==1){
                System.out.println(Math.min(arr1[left1],arr2[left2]));
                return;
            }
            mid1 =(left1+right1)/2;
            mid2 =(left2+right2)/2;
            if(arr1[mid1]==arr2[mid2]){
                System.out.println(arr1[mid1]);
                return;
            }else if(arr1[mid1]>arr2[mid2]){
                right1=mid1;
                left2= mid2+(len%2==0?1:0);
            }else if(arr1[mid1]<arr2[mid2]){
                right2=mid2;
                left1= mid1+(len%2==0?1:0);
            }
            len=right1-left1+1;
        }
    }
    public static void main(String[] args){

    }
}
