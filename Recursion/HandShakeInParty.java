public class HandShakeInParty {
    public static int handShake(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int first = handShake(n-1);
        int second = (n-1)*handShake(n-2);

        return first + second;
    }
    public static void main(String[] args) {
        int n = 5;
        HandShakeInParty obj = new HandShakeInParty();
        int result = obj.handShake(n);
        System.out.println(result);
    }
}
