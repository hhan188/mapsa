package practice9.final5;

public final class MathUtiles {

    public static int factorial (int number){
        int result=1;
        for (int i=1;i<=number;i++){
            result*=i;
        }
        return result;

    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                 return false;
            } else {
               continue;
            }

        }
        return true;
    }

}
