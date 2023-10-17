import java.util.*;
public class SubarrayWithGivenSum {
    public static ArrayList<Integer> subarraySum(int [] arr, int n, int s){
        ArrayList<Integer> list = new ArrayList<>();

        if(s == 0){
            list.add(-1);
            return list;
        }

        int start = 0;
        int wSum = 0;
        int end = 0;
        while(end < n){
            wSum += arr[end];
            while(wSum > s){
                wSum -= arr[start];
                start++;
            }
            if(wSum == s){
                list.add(start +1);
                list.add(end +1);
                break;
            }
            end++;
        }

        if(list.isEmpty()){
            list.add(-1);
        }
        return list;
    }
    public static ArrayList<Integer> subArray(int[] arr, int n, int s){
        ArrayList<Integer> list = new ArrayList<>();
        if(s == 0){
            list.add(-1);
            return list;
        }

        int start = 0;
        int wSum = 0;
        int end = 0;
        while(end < n){
            wSum += arr[end];
            list.add(arr[end]);
            while(wSum > s){
                wSum -= arr[start];
                list.remove(start);
                start++;
            }
            if(wSum == s){
                return list;
            }
            end ++;
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        return list;
    }

    public static ArrayList<Integer> maxSubarray(int a[], int n){
        ArrayList<Integer> list = new ArrayList<>();

        if(n == 0){
            list.add(-1);
            return list;
        }

        int start = 0;
        int maxSoFar = a[0];
        int sum = a[0];

        for(int i = 1; i < n; i++){
            if(a[i] > sum + a[i]){
                start = i;
                sum = a[i];
            }else{
                sum += a[i];
            }

            if(sum > maxSoFar)
            {
                maxSoFar = sum;
            }
        }

        for(int i = start; i < n; i++){
            list.add(a[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{4,5,5,3,2};
        int n = arr.length;
        int s = 13;
        System.out.println(subarraySum(arr, n, s));
        System.out.println(subArray(arr, n, s));
        int[] a = {1, -3, 4, -2, -1, 6};
        ArrayList<Integer> result = maxSubarray(a, a.length);
        System.out.println(result);
    }
}
