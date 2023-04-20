package SoheylSayyah.Practice5;

public class Seventeen {
    public static void main(String[] args) {
        int number = 123456789;
        System.out.println(getEvenDigitSum(number));
    }

    public static int getEvenDigitSum(int number) {
        int firstNumber = number;
        int lastDigit;
        int sum = 0;
        if (number < 0) {
            return -1;
        } else {
            while (number > 0) {
                lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    sum = sum + lastDigit;
                }
                number = number / 10;
            }
        }
        return sum;
    }
}

