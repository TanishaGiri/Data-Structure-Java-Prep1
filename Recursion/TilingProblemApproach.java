import java.io.*;
import java.util.*;
public class TilingProblemApproach {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
//            int[] a = new int[n];
//            String inputLine[] = br.readLine().trim().split(" ");
//            for(int i=0; i<n; i++){
//                a[i] = Integer.parseInt(inputLine[i]);
//            }
            Solution2 obj = new Solution2();
            int result = obj.tailing(n);
            System.out.println(result);
        }
    }
}
class Solution2{
    public int tailing(int n){
        if(n == 0 ||n == 1){
            return 1;
        }
        int vertical = tailing(n-1);
        int horizontal = tailing(n-2);

        return vertical + horizontal;
    }
}
