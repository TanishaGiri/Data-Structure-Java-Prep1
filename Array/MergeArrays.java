import java.util.ArrayList;
import java.util.Collections;

public class MergeArrays {
    public static int [] solve(int[] arr1, int[] arr2, int n, int m){
       ArrayList<Integer> list = new ArrayList<>();

       for(int i=0; i<n; i++){
           list.add(arr1[i]);
       }
       for(int i=0; i<m; i++){
           list.add(arr2[i]);
       }
        Collections.sort(list);

       int[] merged = new int[list.size()];
       for(int i=0; i<list.size(); i++){
           merged[i] = list.get(i);
       }

       return merged;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 6};
        int[] arr2 = {4, 5, 7};
        int[] result = solve(arr1, arr2, arr1.length, arr2.length);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
