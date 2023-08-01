import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class HigestFrequencyNumber {
    public static void frequentNumber(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }

        int maxFreq = Integer.MIN_VALUE;
        int maxCount = Integer.MIN_VALUE;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(maxCount < entry.getValue()){
                maxCount = entry.getValue();
                maxFreq = entry.getKey();
            }
        }
        for(int ele : arr){
            if(ele == maxFreq){
                System.out.println(ele);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            frequentNumber(arr);
        }
    }
}
