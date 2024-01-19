public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 7;
//          upper part
        for(int i=0; i<=n; i++) {
            //1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }

            //spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" " + " ");
            }

            //2nd half
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        // lower part

        for(int i=n; i>=1; i--) {
            //1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }

            //spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" " + " ");
            }

            //2nd half
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}
