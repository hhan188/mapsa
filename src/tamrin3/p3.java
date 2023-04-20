package tamrin3;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        System.out.println("* * * * Name Greeting! * * * *");
        System.out.println();

        String input;
        String output;

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the name (type '-1' for exit): ");
            input = sc.nextLine().trim();
            //checking for "quit" user command
            if (input.equals("-1")) {
                break;
            }
            output = helloName(input);
            System.out.println(output);
        }
    }

    private static String helloName(String input) {
        return "Hello " + input + "!";
    }
}