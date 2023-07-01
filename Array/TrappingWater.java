public class TrappingWater {
    public static int trapWater(int[] arr){
        int trappingWater = 0;

        int[] left = new int[arr.length];
        left[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            left[i] = Math.max(arr[i], left[i-1]);
        }
        int[] right = new int[arr.length];
        right[0] = arr[arr.length-1];
        for(int i=1; i<arr.length; i++){
            right[i] = Math.max(arr[i], right[i-1]);
        }
        for(int i=0; i<arr.length; i++){
            int waterLevel = Math.min(left[i], right[i]);
            trappingWater += waterLevel - arr[i];
        }
        return trappingWater;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 6, 3, 2, 5};
        TrappingWater obj = new TrappingWater();
        System.out.println(obj.trapWater(arr));

    }
}
