package JZOF;

/**
 * Created by chencen on 2016/8/17.
 */
public class minNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==1){
            return array[0];
        }
        int pre=array[0];
        for(int i=1;i<array.length;i++){
            if(pre>array[i]){
                return array[i];
            }
        }
        return 0;
    }
}
