package JZOF;

import java.util.Stack;

public class Main31 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int popIndex = 0;
        for (int i : pushed) {
            stack.push(i);
            while ( !stack.isEmpty() && stack.peek() == popped[popIndex]){
                stack.pop();
                popIndex++;
            }
        }

        return stack.isEmpty();
    }


}
