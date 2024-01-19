public class CompleteTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
       for(int i=1; i<=n; i++){//traversing over rows
           //print r-i spaces
           for(int j =1; j<=n-i; j++){
               System.out.print(" "+" ");
           }
           //print 2*i-1
           for(int j = 1; j<=2*i-1; j++){
               System.out.print("*" +" ");
           }
           System.out.println();
       }
       for(int i=1; i<=n; i++){//traversing over rows

           //print i spaces
           for(int j=1; j<=i; j++){
               System.out.print(" "+" ");
           }

           //print 2*(n-i)+1 stars
           for(int j=1; j<=2*(n-i)+1; j++){
               System.out.print("*"+" ");
           }
           System.out.println();
       }
    }
}
