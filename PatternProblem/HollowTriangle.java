public class HollowTriangle {
    public static void main(String[] args) {
        int n =5;
        for(int i=1; i<=n; i++){
            //print space
            for(int j=1; j<=n-i; j++){
                System.out.print(" "+" ");
            }
            //print increment i
            for(int j=i; i<=n; j++){
                System.out.print(i+" ");
            }
            //print spaces
            for(int j=i-1; j<=2*(i-1)-1; j++){
                System.out.print(" "+ " ");
            }
            //print increment i
            for(int j=1; j<=n; j++){
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
}
