import java.util.Scanner;

public class NoOdSwapSelectionSort {
    public static int selectionSort(int[] arr, int n, int count){
        for(int i=0; i<n-1; i++){
            int smallest = i;
            for(int j=0; j<n-i-1; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            count++;
            int temp = arr[i] ;
            arr[i] = arr[i+1];
            arr[i+1] = temp;

        }
        return count;
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
            int count = 0;
            System.out.println(selectionSort(arr, n, count));
        }
    }
}
