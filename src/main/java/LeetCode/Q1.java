package LeetCode;

import java.util.Arrays;

/**
 * Created by chencen on 2016/7/28.
 */
public class Q1 {
    public int[] twoSum(int[] nums, int target){
        int[] copy=Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        int right=nums.length-1;
        int left=0;
        int sum=0;
        int res1=0;
        int res2=0;
        while(left<right){
            sum=nums[left]+nums[right];
            if(sum==target){
               for(int i=0;i<copy.length;i++){
                   if(nums[left]==copy[i]){
                       res1=i;
                       break;
                   }
               }
                for(int i=0;i<copy.length;i++){
                    if(nums[right]==copy[i]){
                        if(res1!=i) {
                            res2 = i;
                        }
                    }
                }
                return new int[]{res1,res2};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return null;
    }
    public static void main(String[] args){
        int[] arr={0,4,3,0};
        System.out.println(new Q1().twoSum(arr,0));
    }

}
