package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chencen on 2016/9/3.
 */
public class Main54 {
    List<Integer> list=new ArrayList<Integer>();
    public void print(int[][] matrix,int x1,int y1,int x2,int y2){
        for(int i=x1;i<=x2;i++){
            list.add(matrix[y1][i]);
        }
        for(int i=y1+1;i<=y2;i++){
            list.add(matrix[i][x2]);
        }
        if(y1!=y2){
            for(int i=x2-1;i>=x1;i--){
                list.add(matrix[y2][i]);
            }
        }
        if(x1!=x2){
            for(int i=y2-1;i>x1;i--){
                list.add(matrix[i][x1]);
            }
        }

    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int y2=matrix.length-1;
        if(y2==-1){
            return list;
        }
        int x2=matrix[0].length-1;
        if(x2==-1){
            return list;
        }
        int x1=0;
        int y1=0;
        while(x1<=x2&&y1<=y2){
            print(matrix,x1,y1,x2,y2);
            x1++;
            y1++;
            x2--;
            y2--;
        }
        return list;
    }
}
