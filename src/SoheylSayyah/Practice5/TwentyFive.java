package SoheylSayyah.Practice5;

import java.util.Arrays;
import java.util.Scanner;

public class TwentyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Number : ");
        int number = scanner.nextInt();
        System.out.println("Your Largest Prime Factor is : " + getFactors(number));
    }

    public static int getFactors(int number) {
        StringBuilder primeFactors = new StringBuilder();
        int d = 2;
        int largestPrime = 0;

        while (number > 1) {
            while (number % d == 0) {
                primeFactors.append(d).append(" ");
                number /= d;
            }
            d += 1;
        }

        String[] splitArray = primeFactors.toString().split(" ");
        Arrays.sort(splitArray);
        largestPrime = Integer.parseInt(splitArray[splitArray.length - 1]);

        return largestPrime;
    }
}