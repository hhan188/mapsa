package sajjadEmami.Prac5;

public class P7 {
    public static boolean hasSharedDigits(int num1, int num2) {
        if (num1 < 10 || num1 > 99)
            return false;

        if (num2 < 10 || num2 > 99)
            return false;

        while (num1 > 0) {
            int oneDigit = num1 % 10;
            int twoDigit = num2 % 10;

            if (oneDigit == twoDigit)
                return true;

            num1 /= 10;
            num2 /= 10;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigits(12, 72));
        System.out.println(hasSharedDigits(9, 11));
        System.out.println(hasSharedDigits(15, 55));
    }
}
