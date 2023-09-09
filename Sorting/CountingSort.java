public class CountingSort {
    public static void sorting(int arr[], int n) {
        // create an output array
        int[] output = new int[n];

        // create count array
        int[] count = new int[256];

        // initialize count array
        for (int i = 0; i < 256; ++i) {
            count[i] = 0;
        }

        // place the count of each element present in arr in count array
        for (int i = 0; i < n; ++i) {
            ++count[arr[i]];
        }

        // compute cumulative count in count array
        for (int i = 1; i < 256; ++i) {
            count[i] += count[i - 1];
        }

        // place the cumulative count in output array with respect to its element and indexes
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        for (int i = 0; i < n; ++i) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] ar) {
        int[] arr = new int[]{6, 4, 7, 9, 9, 8};
        int n = arr.length;
        sorting(arr, n);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
