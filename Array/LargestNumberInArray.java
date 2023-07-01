public class LargestNumberInArray {
    public static int largestNumber(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int a : arr){
            if(largest<a){
                largest = a;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,8,7};
        LargestNumberInArray obj = new LargestNumberInArray();
        int result = obj.largestNumber(arr);
        System.out.println(result);

    }
}
