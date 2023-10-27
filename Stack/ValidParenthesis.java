import java.util.Stack;

public class ValidParenthesis {
    public static boolean checker(String str, int n){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "([)]{}";
        int n = str.length();
        boolean result = checker(str, n);
        System.out.println(result);
    }
}
