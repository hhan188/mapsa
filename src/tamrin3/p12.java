package tamrin3;

import java.util.ArrayList;
import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {

        System.out.println("* * * * Rotate Max Number * * * *");

        while (true) {
            long userNumber;
            userNumber = getPositiveNumber();
            if (userNumber == -1)
                break;
            long maxNumber = rotateMaxNumber(userNumber);
            System.out.println("rotateMaxNumber(\"" + userNumber + ") -> " + maxNumber);
        }
    }

    private static long rotateMaxNumber(long userNumber) {

        long number = userNumber;
        ArrayList<Byte> digits = new ArrayList<>();

        if (userNumber == 0)
            return 0;

        while (number != 0) {
            digits.add((byte) (number % 10));
            number = number / 10;
        }

        int c = 0;
        int tempIndex = 0;
        byte tempValue = 0;
        int i = 0;
        int j = 0;

        for (i = c; i <= digits.size() - 2; i++) {
            tempIndex = i;
            tempValue = digits.get(i);

            for (j = i + 1; j <= digits.size() - 1; j++) {
                if (digits.get(j) > tempValue) {
                    tempValue = digits.get(j);
                    tempIndex = j;
                }
            }
            if (tempIndex != i) {
                digits.set(tempIndex, digits.get(i));
                digits.set(i, tempValue);
            }
        }

        number = 0;
        for (int k = 0; k < digits.size(); k++) {
            number = number * 10 + digits.get(k);
        }

        return number;
    }

    public static long getPositiveNumber() {

        long input;
        String userInput;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a positive number (-1 to quit): ");
            userInput = sc.nextLine().trim();
            try {
                input = Long.parseLong(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Number Not Valid!!!");
                continue;
            }
            if (input == -1)
                return input;
            if (input < 0) {
                System.out.println("Number Not Positive!");
                continue;
            }
            break;
        }
        return input;
    }
}