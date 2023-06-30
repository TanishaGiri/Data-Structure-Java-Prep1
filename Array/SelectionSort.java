public class SelectionSort {
    public static void selectSort(int[] a){
        for(int i=0; i<a.length-1; i++) {
            int smallest = i;
            for (int j = 0; j < a.length; j++) {
                if (a[smallest] > a[j]) {
                    smallest = j;
                }
            }
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;

        }
    }

        public static void printArray(int a[]){
            for(int i=0; i<a.length; i++){
                System.out.print(a[i] +" ");
            }
            System.out.println();
        }
        public static void main(String [] args){
            SelectionSort obj = new SelectionSort();
            int a[] = new int[]{7, 8, 3, 1, 2};
            obj.selectSort(a);
            obj.printArray(a);
        }

}

