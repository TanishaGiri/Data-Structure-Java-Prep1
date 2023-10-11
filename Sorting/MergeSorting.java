public class MergeSorting {
    public static void divide(int arr[], int l, int h){
        if(l>=h){
            return;
        }
        int mid = l+(h-l)/2;
        divide(arr, l, mid);
        divide(arr, mid+1, h);
        conquer(arr, l, mid, h);
    }
    public static void conquer(int arr[], int l, int mid, int h) {
        int merged[] = new int[h - l + 1]; // Corrected the size calculation
        int idx1 = l;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= h) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= h) {
            merged[x++] = arr[idx2++];
        }

        // Copy the elements of merged into the original array
        for (int i = 0, j = l; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }


    public static void main(String[] args){
        int arr[] = {7, 3, 1, 2, 8, 5};
        int l = 0;
        int h = arr.length-1;
        divide(arr, l, h);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
