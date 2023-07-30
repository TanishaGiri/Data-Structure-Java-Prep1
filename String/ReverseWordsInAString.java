public class ReverseWordsInAString {
    public static String solve(String str){
        StringBuilder sb = new StringBuilder();
        String arr[] = str.split("\\.");
        for(int i=arr.length-1; i>0; i--){
            sb.append(arr[i] +".");
        }sb.append(arr[0]);
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        System.out.println(solve(str));
    }
}
