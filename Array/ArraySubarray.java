import java.util.ArrayList;

public class ArraySubarray {
    public static int subArray(int n, int[] arr, int k) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int smallest = Integer.MAX_VALUE;

            for (int j = i; j < i + k; j++) {
                smallest = Math.min(smallest, arr[j]);
            }

            largest = Math.max(largest, smallest);
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 8, 9, 8};
        int n = arr.length;
        int k = 3;

        System.out.println(subArray(n, arr, k));
    }
}
