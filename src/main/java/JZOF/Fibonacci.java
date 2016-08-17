package JZOF;

import static java.lang.System.out;

/**
 * Created by chencen on 2016/8/17.
 */
public class Fibonacci {
    public int Fibonacci(int n) {
        if(n<=0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        int n1=1;
        int n2=1;
        int result=0;
        while(n!=2){
            result=n1+n2;
            n2=n1;
            n1=result;
            n--;
        }
        return result;
    }
    public static void main(String[] args){
        out.println(new Fibonacci().Fibonacci(39));

    }
}
