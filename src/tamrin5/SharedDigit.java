package tamrin5;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99)
            return false;
        int inputNum1 = num1;
        int inputNum2 = num2;
        boolean resultFlag = false;

        while (!resultFlag && inputNum1 != 0){
            int digit = inputNum1 % 10;
            while (inputNum2 != 0){
                if (inputNum2 % 10 == digit){
                    resultFlag = true;
                    break;
                }
                inputNum2 /= 10;
            }
            inputNum1 /= 10;
        }

        return resultFlag;
    }
}