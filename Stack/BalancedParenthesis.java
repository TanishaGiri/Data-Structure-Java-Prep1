import java.util.*;
public class BalancedParenthesis {
    public static boolean parenthesisChecker(String str, int n){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) {
                    return false;
                }if(stack.peek() == '(') {
                    stack.pop();
                }
            }
        }
        if(stack.size() != 0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "((()))";
        int n = str.length();
        boolean result = parenthesisChecker(str, n);
        System.out.println(result);
    }
}
