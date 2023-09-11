import java.util.Scanner;
import java.util.ArrayList;
public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();// size of array
            int m = sc.nextInt();// no of student
            ArrayList<Integer> a = new ArrayList<>();
            for(int i=0; i<n; i++){
                int x = sc.nextInt();
                a.add(x);
            }

            Solve obj = new Solve();
            long result = obj.findMinDiff(a, m, n);
            System.out.println(result);
        }
    }
}
class Solve{
    public long findMinDiff(ArrayList<Integer> a, int m, int n){
        Long minDiff = Long.MIN_VALUE;

        for(int i=0; i<n-m; i++){
            int max = a.get(i+m-1);
            int min = a.get(i);
            long diff = max - min;
            if(diff < minDiff)
            {
                minDiff = diff;
            }
        }
        return minDiff;
    }
}
