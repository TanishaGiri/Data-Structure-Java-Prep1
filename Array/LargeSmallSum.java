import java.util.ArrayList;
import java.util.Collections;

public class LargeSmallSum {
    public static void solve(int arr[]){
        if(arr.length <= 3){
            System.out.println(0);
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(i%2 == 0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println(even.get(even.size()-2) + odd.get(1));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 7, 5, 4};
        solve(arr);
    }
}
