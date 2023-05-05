package tamrin9.Final.p5;

public final class MathUtils {

    public static long factorial(int number){
        if (number <= 0)
            return 0;
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isPrime(int number){
        if (number <= 1)
            return false;
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
