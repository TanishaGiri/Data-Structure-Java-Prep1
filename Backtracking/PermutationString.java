import java.util.List;
import java.util.ArrayList;
public class PermutationString {
    public static void swap(StringBuilder sb, int i, int start){
        char ch = sb.charAt(i);
        sb.setCharAt(i,sb.charAt(start));
        sb.setCharAt(start, ch);
    }
    public static void solve(StringBuilder sb, int start, List<String> result){
        if(start >= sb.length()-1){
            result.add(sb.toString());
            return;
        }

        for(int i=start; i<sb.length(); i++){
            PermutationString.swap(sb, i, start);
            PermutationString.solve(sb, start+1, result);
            PermutationString.swap(sb, i, start);
        }
    }
    public static List<String> permute(String str){
        List<String> result =  new ArrayList<>();
        PermutationString.solve(new StringBuilder(str), 0, result);
        return result;
    }
    public static void main(String[] args) {
        String str = "ABC";
        List<String> result = PermutationString.permute(str);
        for(String s : result){
            System.out.println(s + " ");
        }

    }
}
