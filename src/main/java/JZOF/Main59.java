package JZOF;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main59 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(0 == nums.length){
            return new int[0];
        }

        Deque<Integer> deque = new ArrayDeque<>();
        int[] res = new int[nums.length<=k?1:nums.length-k+1];

        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty()&&nums[deque.peekLast()]<nums[i]){
                deque.pollLast();
            }
            deque.offerLast(i);

            if(i- deque.peekFirst()>= k){
                deque.pollFirst();
            }
            res[(i-k<0)?0:(i-k+1)] = nums[deque.peekFirst()];
        }
        return res;

    }
}
