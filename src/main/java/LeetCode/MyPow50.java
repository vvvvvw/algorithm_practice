package LeetCode;

/**
 * Created by chencen on 2016/9/3.
 */
public class MyPow50 {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        } else if (n > 0) {
            if (n % 2 == 0) {
                return Math.pow(myPow(x, n / 2), 2);
            } else {
                return Math.pow(myPow(x, n / 2), 2) * x;
            }
        } else if (n == -1) {
            return 1 / x;
        } else if(n<0){
            if (n % 2 == 0) {
                return Math.pow(myPow(x, n / 2), 2);
            } else {
                return Math.pow(myPow(x, n / 2), 2) * (1 / x);
            }
        }
        return 0;
    }
    public static void main(String[] args){
        myPow(0.44528,0);
    }
}
