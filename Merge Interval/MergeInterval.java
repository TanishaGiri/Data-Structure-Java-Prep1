import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;
public class MergeInterval {
    public static void mergeInterval(Interval[] arr){
        if(arr.length < 0){
            return;
        }

        Stack<Interval> stack = new Stack<Interval>();

        //sort the intervals in increasing order of start time
        Arrays.sort(arr, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2){
                return i1.start - i2.start;
            }
        });

        //push the first interval to stack
        stack.push(arr[0]);

        for(int i=1; i<arr.length; i++){
            Interval top = stack.peek();

            if(top.end < arr[i].start){
                stack.push(arr[i]);
            }

            else if(top.end<arr[i].end){
                top.end = arr[i].end;
                stack.pop();
                stack.push(top);
            }
        }

        System.out.print("THe Merge Intervals are: ");
        while(!stack.isEmpty()){
            Interval t = stack.pop();
            System.out.print("["+t.start+","+t.end+"] ");
        }
    }
    public static void main(String[] args) {
        Interval arr[] = new Interval[4];
        arr[0] = new Interval(6, 8);
        arr[1]=new Interval(1,9);
        arr[2]=new Interval(2,4);
        arr[3]=new Interval(4,7);
        mergeInterval(arr);

    }
}
class Interval{
    int start, end;
    Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
}
