import java.util.Scanner;
import java.util.Arrays;
public class Copycat {
    public static void copy(int n, String text, String copy){
        text = text.toUpperCase();
        copy = copy.toUpperCase();

        char[] s1 = text.toCharArray();
        Arrays.sort(s1);

        char[] s2 = copy.toCharArray();
        Arrays.sort(s2);

        String res1 = new String(s1);
        String res2 = new String(s2);

        if(res1.equals(res2)){
            System.out.println("1");
        }

        System.out.println("0");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String text = sc.next();
        String copy = sc.next();

       copy(n, text, copy);

    }
}
