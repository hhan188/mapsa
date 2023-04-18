package tamrin5;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1)
            return false;
        int sum = 0;
        for (int i = 1; i <= (number / 2); i++) {
            if (number % i == 0)
                sum += i;
        }
        if (sum == number)
            return true;
        else
            return false;
    }
}
