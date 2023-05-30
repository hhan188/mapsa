package tamrin16.p2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Math Operation");
        System.out.println("(1) Addition");
        System.out.println("(2) Subtraction");
        System.out.println("(0) Exit this program");
        System.out.print("Choose your option: ");

        Scanner sc = new Scanner(System.in);
        int userOption = sc.nextInt();

        if (userOption == 0) return;
        if (userOption != 1 && userOption != 2) {
            System.out.println("Incorrect option selected");
            return;
        }

        sc = new Scanner(System.in);
        System.out.println("Input first number:");
        Double a = sc.nextDouble();
        System.out.println("Input second number:");
        Double b = sc.nextDouble();

        System.out.println("Output: ");

        switch (userOption) {
            case 1 -> {
                AdditionOperation ao = new AdditionOperation();
                System.out.println(ao.performOperation(a, b));
            }
            case 2 -> {
                SubtractionOperation so = new SubtractionOperation();
                System.out.println(so.performOperation(a, b));
            }

        }

    }
}
