import java.util.HashMap;
import java.util.*;
public class FrequencyCountString {
    public static void solve(String str, int n){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int count = 0;
        for(char ch : str.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch, 0)+1);
        }
        StringBuilder sb = new StringBuilder();

        for(char ch : hashMap.keySet()){
            count = hashMap.get(ch);
            if(count>1){
                sb.append(ch);
                sb.append(count);
            }else{
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());

    }
    public static void main(String[] args) {
        String str ="aabbccdddeee";
        solve(str, str.length());

    }
}
