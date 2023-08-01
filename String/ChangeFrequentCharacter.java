import java.util.HashMap;
import java.util.Map;

public class ChangeFrequentCharacter {
    public static String freqnetCharacter(String str, char x){
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int maxCount = 0;
        char maxChar = '\0';
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount = entry.getValue();
                 maxChar = entry.getKey();
            }
        }

        for(char ch : str.toCharArray()){
            if(ch == maxChar){
                sb.append(x);
            }else{
                sb.append(ch);
            }
        }

        return sb.toString();

    }
    public static void main(String[] args) {
        String str = "bbadbbababb";
        System.out.println(freqnetCharacter(str, 't'));
    }
}
