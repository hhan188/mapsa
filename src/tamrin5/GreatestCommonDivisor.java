package tamrin5;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int num1, int num2) {
        if (num1 < 10 || num2 < 10)
            return -1;
        //Math.max(num1, num2)
        int d1 = num1 <= num2 ? num2 : num1;
        //Math.min(num1, num2)
        int d2 = num1 <= num2 ? num1 : num2;
        int r = d1 % d2;
        while (true) {
            if (r == 0)
                return d2;
            d1 = d2;
            d2 = r;
            r = d1 % d2;
        }
    }
}
