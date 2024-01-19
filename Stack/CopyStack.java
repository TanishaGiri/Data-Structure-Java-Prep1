import java.util.*;
public class CopyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n;
        System.out.println("Enter the elements you want to insert: ");
        n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            stack.push(x);
        }
        System.out.println(stack);
    }
}
