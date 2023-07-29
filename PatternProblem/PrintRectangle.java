import java.util.Scanner;
public class PrintRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=1; j<n+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
