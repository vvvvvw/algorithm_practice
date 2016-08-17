package JZOF;

/**
 * Created by chencen on 2016/8/17.
 */
public class RectCover {
    public int RectCover(int target) {
        if(target<=0){
            return 0;
        }
        if(target==1){
            return 1;
        }else if(target==2){
            return 2;
        }
        return RectCover(target-2)+RectCover(target-1);
    }
}
