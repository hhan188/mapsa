package Prac11.P8;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            showSum();
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void showSum() throws NumberFormatException{
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 4 ; i++) {
            if (!sc.hasNextInt())
                throw new NumberFormatException("invalid num");

            sum += sc.nextInt();
        }
        System.out.println("sum : " + sum);
    }
}
