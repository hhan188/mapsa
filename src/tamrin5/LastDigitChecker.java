package tamrin5;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3))
            return false;
        byte a1 = (byte) (num1 % 10);
        byte a2 = (byte) (num2 % 10);
        byte a3 = (byte) (num3 % 10);

        return a1 == a2 || a1 == a3 || a2 == a3;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}