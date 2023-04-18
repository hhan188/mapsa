package tamrin5;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        byte numberDigitCount = getDigitCount(number);
        int reverseNumber = reverse(number);
        byte reverseDigitCount = getDigitCount(reverseNumber);

        do {
            byte digit = (byte) (reverseNumber % 10);
            switch (digit) {
                case 0:
                    System.out.println("ZERO");
                    break;
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;
                default:
                    System.out.println("Invalid Digit");
                    break;
            }
            reverseNumber /= 10;
        } while (reverseNumber != 0);

        if (numberDigitCount - reverseDigitCount != 0) {
            for (int i = 1; i <= numberDigitCount - reverseDigitCount; i++) {
                System.out.println("ZERO");
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        byte digit;
        while (true) {
            digit = (byte) (number % 10);
            reverse = reverse * 10 + digit;
            number /= 10;
            if (number == 0)
                break;
        }
        return reverse;

    }

    public static byte getDigitCount(int number) {
        if (number < 0)
            return -1;
        byte count = 0;
        while (true) {
            if (number / 10 != 0) {
                count++;
                number /= 10;
                continue;
            } else {
                count++;
                break;
            }
        }
        return count;
    }
}
