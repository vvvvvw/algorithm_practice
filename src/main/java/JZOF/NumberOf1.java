package JZOF;

/**
 * Created by chencen on 2016/8/17.
 */
public class NumberOf1 {
    public int  NumberOf1(int n) {
        int count=0;
        if(n<0){
            count=1;
        }else{
            count=0;
        }
        int a=1<<30;
        for(int i=0;i<31;i++){
            if((n&a)>0){
                count++;
            }
            a>>=1;
        }
        return count;


    }
    public static void main(String[] args){
        new NumberOf1().NumberOf1(1);
    }
}
