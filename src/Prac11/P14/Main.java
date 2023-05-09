package Prac11.P14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int sum = 0;
            for (int i = 0 ; i < 4; i++)
                sum += Integer.parseInt(scanner.next());

            System.out.println("sum : " + sum);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
