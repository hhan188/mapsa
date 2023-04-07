package sajjadEmami.Prac5;

public class P6 {
    public static int getEvenDigitSum(int num) {
        if (num < 0)
            return -1;

        int evenSum = 0;

        while (num > 0) {
            int currentDigit = (num % 10);
            if (currentDigit % 2 == 0)
                evenSum += currentDigit;
            num /= 10;
        }

        return evenSum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(234));
        System.out.println(getEvenDigitSum(-1));
        System.out.println(getEvenDigitSum(257));
    }
}
