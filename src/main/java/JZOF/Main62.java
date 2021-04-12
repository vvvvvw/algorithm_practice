package JZOF;

public class Main62 {

    public int lastRemaining(int n, int m) {
        if(1==n){
            return 1;
        }
        return (m+lastRemaining(n,m))%n;
    }
}
