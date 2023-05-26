package practices.practice15.exercise11;

public class Utils {
    protected static boolean checkPrefect(int number) {
        int sum = 0;
        for (int i = 2; i <=number ; i++) {
            if (number%i==0){
                sum+=number/i;
            }
        }
        return sum==number;

    }
}
