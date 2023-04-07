package sajjadEmami.Prac5;

import java.util.ArrayList;
import java.util.Scanner;

public class P16 {
    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numsList = new ArrayList<Integer>();

        do {
            System.out.println("Enter Number :");
            numsList.add(sc.nextInt());
        } while (sc.hasNextInt());

        int sum = 0;
        double average = 0;

        for (Integer num : numsList) {
            sum += num;
        }

        average = (double) sum / numsList.size();
        System.out.println("SUM = " + sum + " AVERAGE = " + average);
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
