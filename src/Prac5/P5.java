package Prac5;

public class P5 {
    public static int sumFirstAndLastDigits(int num) {
        if (num < 0)
            return -1;

        int lastDigit = num % 10;
        int firstDigit = 0;
        while (num != 0) {
            firstDigit = num % 10;
            num /= 10;
        }
        return firstDigit + lastDigit;
    }
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigits(252));
        System.out.println(sumFirstAndLastDigits(5));
        System.out.println(sumFirstAndLastDigits(-454));
    }
}
