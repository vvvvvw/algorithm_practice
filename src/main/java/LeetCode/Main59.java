package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main59 {
    class MaxQueue {

        private Deque<Integer> deque = new ArrayDeque<Integer>();

        private Queue<Integer> queue = new LinkedList<Integer>();

        public MaxQueue() {

        }

        public int max_value() {
            if(deque.isEmpty()){
                return -1;
            }
            return deque.peekFirst();
        }

        public void push_back(int value) {
            queue.offer(value);
            while (!deque.isEmpty() && value > deque.peekLast()) {
                deque.pollLast();
            }
            deque.offerLast(value);
        }

        public int pop_front() {
            if(queue.isEmpty()){
                return -1;
            }

            int res = queue.poll();
            if (res == deque.peekFirst()) {
                deque.poll();
            }
            return res;
        }


    }
}
