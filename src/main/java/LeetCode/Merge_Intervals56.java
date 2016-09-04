package LeetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by chencen on 2016/9/3.
 */
public class Merge_Intervals56 {
      public class Interval {
          int start;
          int end;
          Interval() { start = 0; end = 0; }
          Interval(int s, int e) { start = s; end = e; }
      }
    public List<Interval> merge(List<Interval> intervals) {
        ArrayList<Interval> intervals1=new ArrayList<Interval>();
        if(null==intervals||0==intervals.size()){
            return intervals;
        }
        intervals.sort(new Comparator<Interval>() {
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });
        int start=intervals.get(0).start;
        int end=intervals.get(0).end;
        for(int i=1;i<intervals.size();i++){
            if(intervals.get(i).start<=end){
                end=Math.max(intervals.get(i).end,end);
            }else{
                intervals1.add(new Interval(start,end));
                start=intervals.get(i).start;
                end=intervals.get(i).end;
            }
        }
        intervals1.add(new Interval(start,end));
        return intervals1;
    }
}
