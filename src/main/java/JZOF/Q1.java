package JZOF;

import java.util.Arrays;

import static java.lang.System.out;

/**
 * Created by chencen on 2016/7/27.
 */
public class Q1 {
        public boolean columnBinarySearch(int[][] array,int column,int start,int end,int target){
            if(start==end){
                if(target==array[start][column]){
                    return true;
                }else{
                    return false;
                }
            }
            int mid=(start+end)/2;
            if(target==array[mid][column]){
                return true;
            }else if(target<array[mid][column]){
                return columnBinarySearch(array,column,start,mid-1,target);
            }else{
                return columnBinarySearch(array,column,mid+1,end,target);
            }

        }
        public boolean Find(int [][] array,int target) {
            int index=Arrays.binarySearch(array[0],target);
            if(0<=index){
                    return true;
            }else if(-1==index) {
                return false;
            }else{
                    index=-(index+1);
                    return columnBinarySearch(array,index-1,0,array.length-1,target);
                }
        }
    public static void main(String[] args){
        int[][] arr={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        out.println(new Q1().Find(arr,5));

    }
}
