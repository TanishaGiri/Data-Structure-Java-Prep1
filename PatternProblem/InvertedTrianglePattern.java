public class InvertedTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){// for increment j range it from 1 to r-i+1, where r is n.
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
