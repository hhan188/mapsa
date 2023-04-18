package tamrin5;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        long sum = 0;
        long avg = 0;
        int count = 0;
        String inputString;
        int inputNumber;

        System.out.println("INPUT:");
        while (true) {
            Scanner sc = new Scanner(System.in);
            inputString = sc.nextLine();
            try {
                inputNumber = Integer.parseInt(inputString);
                sum += inputNumber;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("OUTPUT:");
                if (count == 0) {
                    System.out.println("SUM = 0 AVG = 0");
                    break;
                }
                avg = Math.round(sum / count);
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }
    }
}
