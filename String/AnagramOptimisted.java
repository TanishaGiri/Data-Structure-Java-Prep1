import java.util.HashMap;
import java.util.Map;


public class AnagramOptimisted {
        public static boolean areAnagrams(String str1, String str2) {
            // Check if lengths are different, if so, they can't be anagrams
            if (str1.length() != str2.length()) {
                return false;
            }

            // Use a map to count character frequencies in str1
            Map<Character, Integer> charCountMap = new HashMap<>();

            for (char c : str1.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            // Update frequencies based on characters in str2
            for (char c : str2.toCharArray()) {
                if (!charCountMap.containsKey(c)) {
                    return false;  // Character in str2 not present in str1
                }

                charCountMap.put(c, charCountMap.get(c) - 1);

                if (charCountMap.get(c) == 0) {
                    charCountMap.remove(c);  // Remove entry when frequency becomes zero
                }
            }

            // If the map is empty, all characters in str1 have been accounted for in str2
            return charCountMap.isEmpty();
        }

        public static void main(String[] args) {
            String str1 = "listen";
            String str2 = "silent";

            if (areAnagrams(str1, str2)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }


}
