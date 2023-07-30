import java.util.*;
public class AnagramString {
    public static boolean solve(String s1, String s2){
        // Remove spaces and convert to lowercase to make comparison case-insensitive
        s1 = s1.replaceAll("\\s","").toLowerCase();
        s2 = s2.replaceAll("\\s","").toLowerCase();

        if(s1.length() != s2.length()){
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        if(solve(s1, s2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
