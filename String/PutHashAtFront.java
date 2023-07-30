public class PutHashAtFront {
    public static String solve(String str) {
        StringBuilder result = new StringBuilder();
        StringBuilder hashChars = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                hashChars.append(ch);
            } else {
                result.append(ch);
            }
        }

        result.insert(0, hashChars);
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "move#hash#to#front";
        System.out.println(solve(str));
    }
}


