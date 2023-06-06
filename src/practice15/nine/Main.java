package practice15.nine;

import static practice15.nine.Digits.countDigits;

public class Main {
    public static void main(String[] args) {
        int num = 12345;
        int digitCount = countDigits(num);
        System.out.println("The number of digits in " + num + " is: " + digitCount);

    }
}
