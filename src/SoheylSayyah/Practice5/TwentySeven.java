package SoheylSayyah.Practice5;

import java.util.Scanner;

public class TwentySeven {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        System.out.println("Please Enter Your Inputs : ");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double average;
        while (true){
            boolean isInt = scanner.hasNextInt();
            if (isInt){
                int number = scanner.nextInt();
                count ++;
                sum = sum + number;
            }else {
                break;
            }
        }
        if (count == 0){
            System.out.println("SUM = 0 , AVG = 0");
        }else {
            average = Math.round(sum / count);
            System.out.println("SUM = " + sum + " , AVG = " + (int) average);
        }
        scanner.close();
    }
}
