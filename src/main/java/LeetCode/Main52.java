package LeetCode;

/**
 * Created by chencen on 2016/9/3.
 */
public class Main52 {
    private int count;
    private int n;
    public boolean isvalid(int[] ints,int x,int y) {
        for (int i = 0; i < x; i++) {
            if (ints[i] == y || (y - x == ints[i] - i) || (x + y == ints[i] + i)) {
                return false;
            }
        }
        return true;
    }
    public void solve(int x,int y,int[] ints){
        if(x==n){
           count++;
        }
       for(int i=0;i<n;i++){
           if(isvalid(ints,x,i)){
               ints[x]=i;
               solve(x+1, 0, ints);
           }
       }

    }
    public int totalNQueens(int n) {
        int[] ints=new int[n];
        this.n=n;
        solve(0,0,ints);
        return count;

    }

    public static void main(String[] args){
        System.out.println(new Main52().totalNQueens(4));
    }
}
