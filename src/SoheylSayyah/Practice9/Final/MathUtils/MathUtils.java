package SoheylSayyah.Practice9.Final.MathUtils;

public class MathUtils {
public static long factorial(int number){
    long factorial = 1;
    for (int i = 1; i <= number ; i++) {
        factorial *= i;
    }
    return factorial;
}
public static boolean isPrime(int number){
    int n = number / 2;
    for (int i = 2; i <= n; i++) {
        if (number % i == 0){
            return false;
        }
    }
    return true;
}
}

