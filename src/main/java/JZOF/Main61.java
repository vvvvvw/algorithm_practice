package JZOF;

import java.util.HashSet;
import java.util.Set;

public class Main61 {
    public boolean isStraight(int[] nums) {

        Set<Integer> visitedNums = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(0==nums[i]){
                continue;
            }
            if(visitedNums.contains(nums[i])){
                return false;
            }
            if(max < nums[i]){
                max = nums[i];
            }
            if(min > nums[i]){
                min = nums[i];
            }
        }
        return (max-min<5);
    }

}
