import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Merge {
    public static void main(String[] args) {
        List<Interval>interval=new ArrayList<>();
        interval.add(0,new Interval(1,3));
        interval.add(1,new Interval(2,5));
        interval.add(2,new Interval(7,10));
        List<Interval>result=merge(interval);
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i).start+","+result.get(i).end);
        }
    }
    public static class Interval {
        private int start;
        private int end;
        Interval(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
    //we have given list of intervals as [{2,5},{1,3},{7,10}] we should merge intervals if it's overlapping if not return itself

    public static List<Interval> merge(List<Interval>intervals){
        //check if 1 interval exists then return this interval
        if(intervals.size()<2) return intervals;
        //it's static method for sorting intervals for start element
        intervals.sort(Comparator.comparingInt(in->in.start));
        List<Interval>result=new LinkedList<>();
        Interval first=intervals.get(0);
        int start=first.start;
        int end=first.end;
        for(int i=1;i<intervals.size();i++){
            Interval current=intervals.get(i);
            //it's main logic for checking overlapping intervals
            if(current.start<=end){
                end=Math.max(current.end,end);
            }
            else{
                result.add(new Interval(start,end));
                start=current.start;
                end=current.end;
            }
        }
        result.add(new Interval(start,end));
        return result;
    }
}