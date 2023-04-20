package tamrin3;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        System.out.println("* * * * Less Than 100 * * * *");
        System.out.println();

        int[] getNum;
        int num1;
        int num2;

        while (true){
            getNum = getInteger();
            if (getNum[1] == -1)
                return;
            num1 = getNum[0];

            getNum = getInteger();
            if (getNum[1] == -1)
                return;
            num2 = getNum[0];

            boolean result = lessThan100(num1,num2);
            System.out.println("lessThan100(" + num1 + "," + num2 + ") -> " + result);
        }
    }

    private static boolean lessThan100(int num1, int num2) {
        return (num1+num2<100) ? true : false ;
    }

    private static int[] getInteger(){

        Scanner sc = new Scanner(System.in);
        String inputStr;
        int[] output = new int[2];

        while (true) {
            System.out.print("Enter an integer (type 'quit' to exit): ");
            inputStr = sc.nextLine().trim().toLowerCase();
            //checking for "quit" user command
            if (inputStr.equals("quit")) {
                output[1] = -1;
                break;
            }
            //Ensure that user input is a valid integer number
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