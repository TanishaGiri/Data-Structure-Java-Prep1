public class ReverseAnArray {
    public static void reverseArray(int[] arr){
        int first = 0;
        int last = arr.length-1;
        while(first<last){
            //swap
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        reverseArray(arr);
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
