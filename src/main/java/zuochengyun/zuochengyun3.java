package zuochengyun;

import java.util.Stack;

public class zuochengyun3 {
    public static void reverse(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }
        int i = getAndRemoveLastEle(stack);
        reverse(stack);
        stack.push(i);
        return;
    }

    private static int getAndRemoveLastEle(Stack<Integer> stack) {
        if (1== stack.size()){
            return stack.pop();
        }

        int i = stack.pop();
        int res = getAndRemoveLastEle(stack);
        stack.push(i);
        return res;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        reverse(stack);
        stack.stream().forEach(System.out::println);
    }
}
