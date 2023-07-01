public class PrefixSumMaxSubArray {
    public static int prefixSum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];

        for(int i=1; i< arr.length; i++){
            prefix[i] = arr[i] +arr[i-1];
        }
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=0; j<arr.length; j++){
                int end = j;
                int sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1, -2, 6, -1, 3};
        PrefixSumMaxSubArray obj = new PrefixSumMaxSubArray();
        System.out.println(obj.prefixSum(arr));
    }
}
