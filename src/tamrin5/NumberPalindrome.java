package tamrin5;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int inputNum = number;
        int reverse = 0;
        while (inputNum != 0){
            reverse = reverse + inputNum % 10;
            inputNum /= 10;
            if (inputNum == 0)
                break;
            reverse *= 10;
        }
        if (reverse == number)
            return true;
        else
            return false;
    }
}
