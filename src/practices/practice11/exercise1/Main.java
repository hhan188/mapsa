package practices.practice11.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("please enter number: ");
                Integer.parseInt(sc.next());
            }
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException: ENTER DIGIT NUMBER");
        }
    }
}
