package JZOF;

import static java.lang.System.out;

/**
 * Created by chencen on 2016/7/27.
 */
public class FindInTwoDimen {
        public boolean Find(int [][] array,int target) {
            int m=0;
            int n=array[0].length-1;
            while(m<array.length&&n>=0){
                if(target==array[m][n]){
                    return true;
                }else if(target<array[m][n]){
                    n--;
                }else{
                    m++;
                }
            }
            return false;
        }
    public static void main(String[] args){
        int[][] arr={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        out.println(new FindInTwoDimen().Find(arr,5));

    }
}
