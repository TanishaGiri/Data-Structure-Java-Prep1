import java.util.Stack;

public class RemoveConsecutiveSubsequence {
    public static int[] subsequence(int[] arr, int n){
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){
            if(stack.size() == 0 || stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
            if(stack.peek() == arr[i]){
                if(i == n-1 || arr[i] != arr[i+1]){
                    stack.pop();
                }
            }
        }

        int [] result = new int[stack.size()];

        for(int i=result.length-1; i>=0; i--){
            result[i] = stack.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};
        int n = arr.length;
        int[] result = subsequence(arr, n);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] +" ");
        }
    }
}
