package LeetCode;

/**
 * Created by chencen on 2016/9/3.
 */
//*****
public class Jump_Game55 {
    public boolean canJump(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i>max){
                return false;
            }else{
                max=Math.max(max,nums[i]+i);
            }
        }
        return true;
    }

}
