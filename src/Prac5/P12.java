package Prac5;

public class P12 {
    public static int reverse(int num) {
        int reverse = 0, rem = 0;
        while (num != 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int num) {
        if (num < 1)
            return -1;

        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void numberToWords(int num) {
        if (num < 0)
            System.out.println("Invalid value");

        int count = getDigitCount(num);
        int reverse = reverse(num);
        int reverseCount = getDigitCount(reverse);
        int temp = 0;
        while (reverse > 0) {
            temp = reverse % 10;
            switch (temp) {
                case 0 -> System.out.println("zero");
                case 1 -> System.out.println("one");
                case 2 -> System.out.println("two");
                case 3 -> System.out.println("three");
                case 4 -> System.out.println("four");
                case 5 -> System.out.println("five");
                case 6 -> System.out.println("six");
                case 7 -> System.out.println("seven");
                case 8 -> System.out.println("eight");
                case 9 -> System.out.println("nine");
            }
            reverse /= 10;
        }

        if (count != reverseCount) {
            int diff = count - reverseCount;
            for (int i = 0; i < diff; i++)
                System.out.println("zero");
        }

        System.out.println("**************");
    }

    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }
}
