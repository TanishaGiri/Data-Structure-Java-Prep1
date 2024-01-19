public class MirrorPyramidal {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){//traverse through row

            //space print
            for(int j=1; j<=n-i; j++){
                System.out.print(" "+" ");
            }

            //print ascending number(j)
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }

            //print decreasing j
            for(int j=i-1; j>=1; j--){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
