package zuochengyun;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.stream.Stream;

public class zuochengyun7 {

    public static int[] getMaxArr(int[] arr, int w){
        if ( null ==arr || arr.length < w || 0== w){
            return new int[0];
        }
        int[] res = new int[arr.length - w + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i=0; i< arr.length; i++) {
            if (0 != i && i - deque.peekFirst() >= w) {
                deque.pollFirst();
            }
            if (0 == deque.size()) {
                deque.addLast(i);
            } else if (arr[deque.peek()] > arr[i]) {
                deque.addLast(i);
            } else {
                while (0 != deque.size() && deque.peek() <= arr[i]) {
                    deque.poll();
                }
                deque.addLast(i);
            }

            if (i >= w-1) {
                res[i - w +1] = arr[deque.peekFirst()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = getMaxArr(new int[]{4, 3, 5, 4, 3, 3, 6, 7}, 3);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
