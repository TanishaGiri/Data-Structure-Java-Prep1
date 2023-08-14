import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class StockBuyAndSell {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int A[] = new int[n];
              String inputLine[] = br.readLine().trim().split(" ");
               for(int i=0; i<n; i++){
                  A[i] = Integer.parseInt(inputLine[i]);
                 }
            //     OR
//            for(int i=0; i<n; i++){
//                A[i] = Integer.parseInt(String.valueOf(br.readLine().trim().split(" ")));
//            }

            int p = 0;
            for(int i=0; i<n-1; i++)
                p += Math.max(0, A[i+1]-A[i]); // for calculating profit

            Solution obj = new Solution();
            ArrayList<ArrayList<Integer>> ans = obj.stockBuySell(A, n);
            if(ans.size() == 0){
                System.out.println("No profit");
            }else{
                int c= 0;
                for(int i=0; i<ans.size(); i++){
                    c += A[ans.get(i).get(1)]-A[ans.get(i).get(0)];
                }
                if(c == p){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }
            System.out.println();
        }
    }
}
class Solution{
    ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int i = 0;
        while(i <n-1){
            // buying stock
            while(i<n-1 && A[i]>= A[i+1]){
                i++;
            }
            if(i == n-1){
                break;
            }

            ArrayList<Integer> list = new ArrayList<>();
            list.add(i); // here is the point where we finally bought an stock

            while(i<n-1 && A[i] <= A[i+1]){
                i++;
            }
            list.add(i);
            result.add(list);
        }
        return result;
    }
}
