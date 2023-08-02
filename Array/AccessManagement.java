import java.util.Arrays;

public class AccessManagement {
    public static int management(int[] arr, int k){
        Arrays.sort(arr);
        ReverseAnArray.reverseArray(arr);

        for(int i=0; i<arr.length; i++){
           if(k<=i){
               return arr[k];
           }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {74, 85, 102, 99, 101, 56, 84};
        int k = 3;
        System.out.println(management(arr, k));
    }
}
