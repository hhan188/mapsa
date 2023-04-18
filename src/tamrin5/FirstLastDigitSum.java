package tamrin5;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number<0)
            return -1;
        int firstDigit;
        int lastDigit = 0;

        firstDigit = number % 10;

        int inputNum = number;
        while (inputNum !=0){
            lastDigit = inputNum;
            inputNum/= 10;
        }
        return firstDigit + lastDigit;
    }
}
