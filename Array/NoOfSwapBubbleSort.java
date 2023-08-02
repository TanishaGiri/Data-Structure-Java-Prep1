import java.util.Scanner;
public class NoOfSwapBubbleSort {
    public static int sort(int[] arr, int n, int count){
        for(int i=0; i<n; i++){
            for(int j=i; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
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
            System.out.println(sort(arr, n, count));
        }
    }
}
