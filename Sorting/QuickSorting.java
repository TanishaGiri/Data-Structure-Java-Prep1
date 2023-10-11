public class QuickSorting {
    public static void quickSort(int[] arr, int l, int h){
        if(l < h){
            int pivot = partition(arr, l, h);
            quickSort(arr, l, pivot-1);
            quickSort(arr, pivot+1, h);
        }
    }
    public static int partition(int arr[], int l, int h){
        int pivot = arr[h];
        int i = l-1;
        for(int j=l; j<h; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[h];
        arr[h] = temp;

        return i;

    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        // print
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
