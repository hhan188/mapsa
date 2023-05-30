package tamrin16.p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("String Operation");
        System.out.println("(1) Convert the input string to Lowercase");
        System.out.println("(2) Convert the input string to Uppercase");
        System.out.println("(0) Exit this program");
        System.out.print("Choose your option: ");

        Scanner sc = new Scanner(System.in);
        int userOption = sc.nextInt();

        if (userOption == 0) return;
        if (userOption != 1 && userOption != 2) {
            System.out.println("Incorrect option selected");
            return;
        }

        System.out.println("Input your string:");
        sc = new Scanner(System.in);
        String userStr = sc.nextLine();

        System.out.println("Output: ");

        switch (userOption) {
            case 1 -> {
                LowerCaseOperation LCP = new LowerCaseOperation();
                System.out.println(LCP.performOperation(userStr));
            }
            case 2 -> {
                UpperCaseOperation UCO = new UpperCaseOperation();
                System.out.println(UCO.performOperation(userStr));
            }
        }

//        //create function instead of class
//        switch (userOption) {
//            case 1:
//                //use lambda expression
//                Function<String, String> toLowerCase = str -> str.toLowerCase();
//                System.out.println(toLowerCase.apply(userStr));
//                break;
//            case 2:
//                //use method reference
//                Function<String, String> toUpperCase = String::toUpperCase;
//                System.out.println(toUpperCase.apply(userStr));
//                break;
//        }

    }
}
