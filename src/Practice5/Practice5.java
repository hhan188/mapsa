package com.mapsa.Practice5;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
    }

    //*******************************p12*******************************
    public static void numberInWord(int num) {
        String[] oneDigit = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] twoDigit = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] multiples = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] powers = {"Hundred", "Thousand"};
        int numTemp = num;
        int length = 0;
        while (numTemp != 0) {
            numTemp /= 10;
            length++;
        }

        if (length == 1)
            System.out.println(oneDigit[num]);

        else if (num < 20 && length == 2)
            System.out.println(twoDigit[num - 10]);

        else if (length == 2)
            System.out.println(multiples[num / 10] + oneDigit[num % 10]);

        else if (length == 3)
            System.out.println(oneDigit[num / 100] + powers[0] + multiples[num / 10 % 10] + oneDigit[num % 10]);

        else if (length == 4)
            System.out.println(oneDigit[num / 1000] + powers[1] + oneDigit[num / 100 % 10] + powers[0] + multiples[num / 10 % 10] + oneDigit[num % 10]);

    }

    //*******************************p13*******************************
    public static boolean isLeapYear(int year) {
        if (year < 0 || year > 9999)
            return false;
        if (year % 100 == 0 && !(year % 400 == 0))
            return false;
        return year % 4 == 0;
    }

    public static int getDaysInMonth(int month, int year) {
//        if year is leap year and month equals to february return 29
        if (((year % 100 == 0 && year % 400 == 0) || (!(year % 100 == 0) && year % 4 == 0)) && month == 2)
            return 29;

        switch (month) {
            case 1:
                return 31;
            case 2:
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return -1;
        }
    }

    //*******************************p14*******************************
    public static boolean isOdd(int number) {
        if (number < 0)
            return false;
        return !(number % 2 == 0);
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0)
            return -1;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (!(i % 2 == 0))
                sum += i;

        }
        return sum;
    }

    //*******************************p15*******************************
    public static boolean isPalindrome(int number) {

        int reverse = 0, lastDigit, temp;
        temp = number;

        while (!(number == 0)) {
            lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        return temp == reverse;
    }

    //*******************************p16*******************************
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;

        int lastDigit = number % 10;
        while (number > 10) {
            number /= 10;
        }
//        after while loop "number" variable is the first digit
        return number + lastDigit;
    }

    //*******************************p17*******************************
    public static int getEvenDigitSum(int number) {
        if (number < 0)
            return -1;

        int evenSum = 0;

        while (!(number == 0)) {
            if ((number % 10) % 2 == 0)
                evenSum += number % 10;
            number /= 10;
        }
        return evenSum;
    }

    //*******************************p18*******************************
    public static boolean hasSharedDigit(int first, int second) {
        if ((first < 10 || first > 99)
                || (second < 10 || second > 99))
            return false;

        return (first % 10 == second % 10
                || first % 10 == second / 10
                || first / 10 == second % 10
                || first / 10 == second / 10);
    }

    //*******************************p19*******************************
    public static boolean hasSameLastDigit(int first, int second, int third) {
        if ((first < 10 || first > 999)
                || (second < 10 || second > 999)
                || (third < 10 || third > 999))
            return false;

        return first % 10 == second % 10
                || first % 10 == third % 10
                || third % 10 == second % 10;
    }

    //*******************************p20*******************************
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 0 || second < 0)
            return -1;

        int great = 1;
        for (int i = 1; i < first && i < second; i++) {
            if (first % i == 0 && second % i == 0)
                great = i;
        }
        return great;
    }

    //*******************************p21*******************************
    public static void printFactors(int number) {
        if (number < 1)
            System.out.println("Invalid Value");

        for (int i = 1; i <= number; i++)
            if (number % i == 0)
                System.out.print(i + " ");
    }

    //*******************************p22*******************************
    public static boolean isPerfectNumber(int number) {
        if (number < 1)
            return false;

        int divisible = 0;
        for (int i = 1; i < number; i++)
            if (number % i == 0)
                divisible += i;
        return divisible == number;
    }

    //*******************************p23*******************************
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            System.exit(1);
        }
        String[] numbers = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        if (getDigitCount(reverse(number)) != getDigitCount(number)) {
            int reverse = reverse(number);
            while (reverse % 10 != 0) {
                System.out.print(numbers[reverse % 10]);
                reverse /= 10;
            }
            for (int i = 0; i < getDigitCount(number) - getDigitCount(reverse(number)); i++)
                System.out.print(numbers[0]);
        } else {
            int reverse = reverse(number);
            while (reverse % 10 != 0) {
                System.out.print(numbers[reverse % 10]);
                reverse /= 10;
            }
        }
    }

    public static int reverse(int number) {
        int remainder, reverse = 0;
        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;

        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;

        int i = 0;
        for (; number > 0; i++)
            number /= 10;
        return i;
    }

    //*******************************p24*******************************
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        else if (bigCount == 0)
            return goal <= smallCount;
        return goal % 5 == 0 || goal % 5 <= smallCount;


    }

    //*******************************p25*******************************
    public static int getLargestPrime(int number) {
        if (number < 1)
            return -1;
        int i = number / 2;
        while (number % i != 0)
            i--;
        return i;
    }

    //*******************************p26*******************************
    public static void printSquareStar(int number) {
        if (number < 5)
            System.out.println("Invalid Value");
        else {
            int row;
            int column;
            int current;
            row = column = number;
            for (int i = 0; i < row; i++) {
                current = i;
                for (int j = 0; j < column; j++) {
                    if (i == 0 || j == 0 || i == row - 1 || j == column - 1 || i == j || j == (row - current - 1))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();

            }
        }
    }

    //*******************************p27*******************************
    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        long inputs = 0;
        int counter = 0;
        while (sc.hasNextInt()) {
            inputs += sc.nextInt();
            counter++;
        }
        if (counter == 0)
            System.out.println("SUM = " + 0 + " " + "AVG = " + 0);
        else {
            System.out.print("SUM = " + inputs);
            System.out.print(" AVG = " + Math.round(inputs / counter));
        }
    }

    //*******************************p28*******************************
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        if (width <= 0 || height <= 0 || extraBucket < 0)
            return -1;

        return (int) Math.ceil((width * height) / areaPerBucket - extraBucket);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0)
            return -1;

        return (int) Math.ceil((width * height) / areaPerBucket);

    }
}

