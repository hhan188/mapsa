package tamrin2;

import java.util.Scanner;

public class p4 {

    public static void main(String[] args) {
        System.out.println("* * * * * Integer in range? * * * *");
        System.out.println("Checking a valid & in range integer");
        System.err.println("Type \"quit\" to exit");
        System.out.println("* * * * * * * * * * * * * * * * * *");
        System.out.println();

        int intNumber;
        int lowerBound;
        int upperBound;
        int[] inputInt;

        while(true){
            /*getting parameters one by one*/
            //getting integer (first parameter)
            System.out.println("Enter main number, ");
            inputInt = getInteger();
            //checking for quit command
            if (inputInt[1] == -1)
                return;
            intNumber = inputInt[0];

            //getting lower bound (second parameter)
            System.out.println("Enter lower bound, ");
            inputInt = getInteger();
            //checking for quit command
            if (inputInt[1] == -1)
                return;
            lowerBound = inputInt[0];

            //getting upper bound (third parameter)
            System.out.println("Enter upper bound, ");
            inputInt = getInteger();
            //checking for quit command
            if (inputInt[1] == -1)
                return;
            upperBound = inputInt[0];

            boolean result = intWithinBound(intNumber,lowerBound,upperBound);
            System.out.println("intWithinBound(" + intNumber + "," + lowerBound + "," + upperBound + ") -> " + result);
            System.out.println();
        }
    }

    private static boolean intWithinBound(int intNumber, int lowerBound, int upperBound) {

        return (intNumber >= lowerBound && intNumber < upperBound) ? true : false;
    }

    //method to read integer input and also detect quit user command
    private static int[] getInteger(){

        Scanner sc = new Scanner(System.in);
        String inputStr;
        int[] output = new int[2];

        while (true) {
            System.out.print("Enter an integer: ");
            inputStr = sc.nextLine().trim().toLowerCase();
            //checking for "quit" user command
            if (inputStr.equals("quit")) {
                output[1] = -1;
                break;
            }
            try {
                output[0] = Integer.parseInt(inputStr);
            } catch (NumberFormatException e) {
                System.err.println("Enter a valid integer number");
                continue;
            }
            break;
        }
        return output;
    }
}
