public class InsertionSort {
//    time complexity == o(n^2)
    public static void printArray(int arr[]){

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7,8,2,3,1};
        // 0th index is assumed to be the part of sorted array
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;// to track the sorted array
            while(j>=0 && current<= arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;

        }
        printArray(arr);
    }
}

