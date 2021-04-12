package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chencen on 2016/9/3.
 */
public class Main51 {
    public boolean isvalid(int[] ints,int x,int y) {
        for (int i = 0; i < x; i++) {
            if (ints[i] == y || (y - x == ints[i] - i) || (x + y == ints[i] + i)) {
                return false;
            }
        }
        return true;
    }
    public void solve(int x,int y,int n,int[] ints,char[] chars,List<List<String>> res){
            if(isvalid(ints,x,y)){
                ints[x]=y;
                if(x==n-1) {
                    ArrayList<String> arrayList = new ArrayList<String>();
                    for (int i = 0; i < n; i++) {
                        chars[ints[i]] = 'Q';
                        arrayList.add(new String(chars));
                        chars[ints[i]] = '.';
                    }
                    res.add(arrayList);
                }else{
                    solve(x+1,0,n,ints,chars,res);
                }
        }
        if(y==n-1){
            if(x==n-1){
                return;
            }else{
                return;
            }
        }else{
            solve(x,y+1,n,ints,chars,res);
        }

    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<List<String>>();
        int[] ints=new int[n];
        char[] chars=new char[n];
        for(int i=0;i<n;i++){
            chars[i]='.';
        }
        solve(0,0,n,ints,chars,res);
        System.out.println(res.size());
        return res;
    }
    public static void main(String[] args){
        new Main51().solveNQueens(4);
    }

}
