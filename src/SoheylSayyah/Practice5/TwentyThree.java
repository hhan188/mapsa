package SoheylSayyah.Practice5;

import java.util.Scanner;

public class TwentyThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Number :");
        int number = scanner.nextInt();
        System.out.println(numberToWords(number));
    }
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        } else {
            String stringNumber = String.valueOf(number);
            char[] digits = stringNumber.toCharArray();
            int digitCount = getDigitCount(number);
            String result = "";
            for (int i = 0; i < digitCount; i++) {
                switch (digits[i]) {
                    case '0':
                        result += "Zero ";
                        break;
                    case '1':
                        result += "One ";
                        break;
                    case '2':
                        result += "Two ";
                        break;
                    case '3':
                        result += "Three ";
                        break;
                    case '4':
                        result += "Four ";
                        break;
                    case '5':
                        result += "Five ";
                        break;
                    case '6':
                        result += "Six ";
                        break;
                    case '7':
                        result += "Seven ";
                        break;
                    case '8':
                        result += "Eight ";
                        break;
                    case '9':
                        result += "Nine ";
                        break;
                }
            }
            return result;
        }
    }
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else {
            return (int) Math.floor(Math.log10(number) + 1);
        }
    }
    public static int reverse(int number){
        int reverse = 0 ;
        int lastDigit ;
        while (number >= 1){
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        return reverse;
    }
}
