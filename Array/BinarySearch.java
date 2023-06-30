public class BinarySearch {
    public static int binarySearch(int[] arr, int start, int end, int target)
    {
        int mid = start + (end - start)/2;
        if(end>=start){
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                return binarySearch(arr, start, mid-1, target);
            }else{
                return binarySearch(arr, mid+1, end, target);
            }
        }
        return -1;
    }

    public static void main(String[] ar){
        int[] arr = new int[]{2,3,10,49};
        int target =49;
        int result = binarySearch(arr, 0, arr.length, target);
        if(result==-1){
            System.out.println("Element not found");
        }else{
            System.out.print("Element is found at index: "+result+" ");
        }
    }
}
