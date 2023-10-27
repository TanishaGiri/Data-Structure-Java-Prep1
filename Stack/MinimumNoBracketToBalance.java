import java.util.Stack;

public class MinimumNoBracketToBalance {
    public static int bracketBalance(String str , int n){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            }else{
                if (stack.peek() == '(') {

                    stack.pop();
                }else {
                    stack.push(ch);
                }
            }
        }
        if(stack.isEmpty()){
            return 0;
        }
        return stack.size();
    }
    public static void main(String[] args) {
        String str = "(())()((((()";
        int n = str.length();
        int result = bracketBalance(str, n);
        System.out.println(result);
    }
}
