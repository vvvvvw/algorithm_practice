package LeetCode;

import javafx.scene.control.SpinnerValueFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chencen on 2016/9/3.
 */
public class Insert_Interval57 {
     public class Interval {
         int start;
         int end;
         Interval() { start = 0; end = 0; }
         Interval(int s, int e) { start = s; end = e; }
     }
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if(null==intervals){
            return null;
        }
        if(null==newInterval){
            return intervals;
        }
        if(0==intervals.size()){
            intervals.add(newInterval);
            return intervals;
        }
        int index=-1;
        for(int i=0;i<intervals.size();i++) {
            if(newInterval.end<intervals.get(i).start){
                index=i;
                break;
            }else if(newInterval.start>intervals.get(i).end){
                continue;
            }else{
                newInterval.start=Math.min(newInterval.start,intervals.get(i).start);
                newInterval.end=Math.max(newInterval.end,intervals.get(i).end);
                intervals.remove(i);
                i--;
            }
        }
        if(index==-1){
            intervals.add(newInterval);
        }else{
            intervals.add(index,newInterval);
        }
        return intervals;
    }
    public static void main(String[] args){
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(2,5);
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList.size());
    }
}
