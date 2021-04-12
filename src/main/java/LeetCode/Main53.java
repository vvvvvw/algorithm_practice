package LeetCode;

/**
 * Created by chencen on 2016/9/3.
 */
public class Main53 {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int maxNum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i]>0?sum+nums[i]:0;
            if(maxNum<nums[i]){
                maxNum=nums[i];
            }
            if(sum>max){
                max=sum;
            }
        }
        return maxNum>0?max:maxNum;
    }
}
