package JZOF;

import static java.lang.System.out;

/**
 * Created by chencen on 2016/8/17.
 */
public class JumpFloorII {
    public int JumpFloorII(int target) {
        if(target<=0){
            return 0;
        }
        int[] arr=new int[target];
        arr[0]=1;
        for(int i=1;i<target;i++){
                arr[i]=2*arr[0];
        }
        return arr[target-1];
    }
    public static void main(String[] args){
        int[][] arr={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        out.println(new JumpFloor().JumpFloor(0));

    }
}
