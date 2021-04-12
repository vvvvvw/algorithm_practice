package LeetCode;

public class Main11 {

    public int maxArea(int[] height) {
        if(1>=height.length){
            return 0;
        }

        int low = 0;
        int high = height.length-1;
        int max = Integer.MIN_VALUE;
        while (low<high){
            int temp = (high-low)*Math.min(height[low],height[high]);

            if(temp>max){
                max = temp;
            }

            if(height[low]<height[high]){
                low ++;
            }else{
                high --;
            }

        }
        return max;
    }
}
