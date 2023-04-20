package tamrin2;

import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        System.out.println("* * * * Smaller String Number * * * *");
        System.out.println("Enter two positive number to see witch one is smaller");
        System.out.println("Type \"quit\" to exit");
        System.out.println();

        int[] inputInt;
        int firstNum;
        int secondNum;

        while (true) {
            //getting first number
            System.out.print("Enter first number, ");
            inputInt = getInteger();
            //checking for quit command
            if (inputInt[1] == -1)
                return;
            firstNum = inputInt[0];

            //getting second number
            System.out.print("Enter second number, ");
            inputInt = getInteger();
            //checking for quit command
            if (inputInt[1] == -1)
                return;
            secondNum = inputInt[0];

            printNumeralComparison(firstNum,secondNum);
            printLiteralComparison(Integer.toString(firstNum),Integer.toString(secondNum));
        }
    }

    private static void printNumeralComparison(int firstNum, int secondNum) {
        System.out.print("smallerNum(" + firstNum + "," + secondNum + ") -> ");
        if (firstNum <= secondNum)
            System.out.println(firstNum);
        else
            System.out.println(secondNum);
    }

    private static void printLiteralComparison(String firstNum, String secondNum) {
        System.out.print("smallerNum(" + firstNum + "," + secondNum + ") -> ");

        if (firstNum.length() < secondNum.length()){
            System.out.println(firstNum);
            return;
        }
        else if (secondNum.length() < firstNum.length()){
            System.out.println(secondNum);
            return;
        }

        char firstNumChar;
        char secondNumChar;

        for (int i = 0; i < firstNum.length(); i++) {
            firstNumChar = firstNum.charAt(i);
            secondNumChar = secondNum.charAt(i);

            if (Integer.parseInt(String.valueOf(firstNumChar)) < Integer.parseInt(String.valueOf(secondNumChar))){
                System.out.println(firstNum);
                return;
            } else if (Integer.parseInt(String.valueOf(secondNumChar)) < Integer.parseInt(String.valueOf(firstNumChar))) {
                System.out.println(secondNum);
                return;
            }
            //so Integer.parseInt(String.valueOf(secondNumChar)) == Integer.parseInt(String.valueOf(firstNumChar))
            //so go to next round
        }
        //equal number strings
        System.out.println(firstNum);
    }

    private static int[] getInteger(){

        Scanner sc = new Scanner(System.in);
        String inputStr;
        int[] output = new int[2];

        while (true) {
            System.out.print("Enter a positive integer: ");
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
            //Ensure that user input is a positive integer number
            if (output[0] < 0){
                System.err.println("Enter a positive integer number");
                continue;
            }
            break;
        }
        return output;
    }


}