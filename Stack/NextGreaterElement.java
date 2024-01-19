import java.util.Arrays;
//import java.util.Stack;
//
//public class NextGreaterElement {
//    public static int[] greaterElement(int[] arr, int n, int[] res){
//        Stack<Integer> stack = new Stack<>();
//        Arrays.fill(res, -1);
//        stack.push(arr[n-1]);
//        for(int i=n-2; i>=0; i--){
//            while(stack.peek() < arr[i] && stack.size() > 0){
//                stack.pop();
//            }
//            if(stack.size() == 0){
//                res[i] == -1;
//            }
//            stack.push(arr[i]);
//        }
//    }
//    public static void main(String[] args) {
//        int arr[] = {1, 3, 2, 1, 8, 6, 3, 4};
//        int n = arr.length;
//        int res[] = new int[n];
//
//    }
//}
