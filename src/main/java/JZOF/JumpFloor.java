package JZOF;

import static java.lang.System.out;

/**
 * Created by chencen on 2016/8/17.
 */
public class JumpFloor {
    public int JumpFloor(int target) {
        if(target<=0){
            return 0;
        }else if(target==1){
            return 1;
        }else if(target==2){
            return 2;
        }else{
            return JumpFloor(target-1)+JumpFloor(target-2);
        }

    }
    public static void main(String[] args){
        int[][] arr={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        out.println(new JumpFloor().JumpFloor(0));

    }
}
