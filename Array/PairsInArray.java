public class PairsInArray {
    public static void pairs(int[] arr){
        for(int i=0; i<arr.length; i++){
            int current = arr[i];
            for(int j=i+1; j<arr.length; j++){
                //( x , y ) --> for representation only
                System.out.println("( " + current + " " + "," + " " + arr[j] + " )");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 6, 8, 10};
        PairsInArray obj = new PairsInArray();
        obj.pairs(arr);

    }
}
