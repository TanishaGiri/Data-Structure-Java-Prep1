public class KadansForMaxSubArray {
    public static void kadans(int[] arr){
        int countSum = 0;
        int maxCount = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            countSum = countSum + arr[i];
            if(countSum < 0){
                countSum = 0;
            }
            maxCount = Math.max(maxCount, countSum);
        }
        System.out.println(maxCount);

    }
    public static void main(String[] args) {
        int[] arr = new int[] {1, -2, 6, -1, 3};
        KadansForMaxSubArray  obj = new KadansForMaxSubArray();
        obj.kadans(arr);
    }
}
