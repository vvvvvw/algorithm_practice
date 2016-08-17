package JZOF;

import java.util.Stack;

/**
 * Created by chencen on 2016/8/17.
 */
public class StackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }

    public int pop() {
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        if(!stack2.empty()){
            return stack2.pop();
        }else{
            return -1;
        }
    }
}
