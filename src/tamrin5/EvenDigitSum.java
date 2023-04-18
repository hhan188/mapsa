package tamrin5;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0)
            return -1;
        int sumOfEvenDigits = 0;
        int inputNum = number;
        while (inputNum != 0) {
            if ((inputNum % 10) % 2 == 0)
                sumOfEvenDigits += inputNum % 10;
            inputNum /= 10;
        }
        return sumOfEvenDigits;
    }
}
