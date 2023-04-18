package tamrin5;

public class LargestPrime {
    public static int getLargestPrime(int number){
        if (number < 0)
            return -1;
        if (number == 0 || number == 1)
            return -1;
        for (int i = number ; i >=2 ; i--) {
            if (isPrime(i) && number % i == 0 )
                return i;
        }
        return -1;
    }
    public static boolean isPrime(int number){
        if (number < 2)
            return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
