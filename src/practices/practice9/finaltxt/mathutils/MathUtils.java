package practices.practice9.finaltxt.mathutils;

public final class MathUtils {


    public static int factorial(int parameter) {
        int factorial = 1;
        for (int i = 1; i <= parameter; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
               return false;
            }

        }return true;
    }
}
