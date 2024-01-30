import java.util.*;

public class Insert {
    public static void main(String[] args) {
        List<Interval>intervals=new LinkedList<>();
        intervals.add(new Interval(1,9));
        intervals.add(new Interval(11,13));
        intervals.add(new Interval(14,15));
        //it can be useful if our interval isn't sorted
        intervals.sort(Comparator.comparingInt(in->in.start));
        List<Interval>result=insertAndMergeInterval(intervals,new Interval(2,10));
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i).start+","+result.get(i).end);
        }

    }
    public static class Interval{
        private int start;
        private int end;
        Interval(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
    public static List<Interval>insertAndMergeInterval(List<Interval>intervals,Interval newInterval){
        if(intervals==null ||intervals.isEmpty())
            return intervals;
        List<Interval> result=new LinkedList<>();
        int i=0;
        //we just add to our new list if new interval isn't non-overlapping
        while (i<intervals.size() && intervals.get(i).end<newInterval.start){
            result.add(intervals.get(i));
            i++;
        }
        while(i<intervals.size()&& intervals.get(i).start<=newInterval.end){
            Interval current=intervals.get(i);
            newInterval.start=Math.min(current.start, newInterval.start);
            newInterval.end=Math.max(current.end, newInterval.end);
            i++;
        }
        result.add(newInterval);
        while(i<intervals.size()){
            result.add(intervals.get(i));
            i++;
        }
        return result;
    }
}
