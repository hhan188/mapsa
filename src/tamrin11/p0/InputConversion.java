package tamrin11.p0;

import java.util.Scanner;

public class InputConversion {

    public static void main(String[] args) {

        int userInput = 0;
        try {
            userInput = readUserInput();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Stack Trace is:");
            e.printStackTrace();
        }
    }

    public static int readUserInput() throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer value: ");
        int input;
        try {
            input = sc.nextInt();
        } catch (Exception e) {
            throw new Exception("Not an integer input");
        }
        return input;
    }
}
