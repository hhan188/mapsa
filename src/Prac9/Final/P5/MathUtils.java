package Prac9.Final.P5;

public final class MathUtils {
    public static int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static boolean isPrime(int num) {
        int n = num/2;
        for (int i = 2; i <= n; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
