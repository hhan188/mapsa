package tamrin3;

import java.util.ArrayList;
import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        System.out.println("* * * Return the first element of an array * * *");

        ArrayList<Integer> inputArray = new ArrayList<Integer>();
        int[] intOutput;

        String inputStr;
        int firstValue;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter some numbers to make an array");
            System.out.println("Type 'q' to exit the program or type whatever to start");

            inputStr = sc.nextLine().trim().toLowerCase();
            //checking for "quit" user command
            if (inputStr.equals("q")) {
                break;
            }
            //Getting integers and make an array
            while(true){
                intOutput = getInteger();
                if (intOutput[1] == -1)
                    break;
                inputArray.add(intOutput[0]);
            }
            //check for array with no element
            if(inputArray.size() == 0){
                System.out.println("No integer entered! Try again ...");
                continue;
            }

            //else: array with at least one element created
            firstValue = getFirstValue(inputArray);

            printOutput(inputArray, firstValue);

        }
    }

    private static void printOutput(ArrayList<Integer> inputArray, int firstValue) {
        System.out.println("Output:");
        System.out.print("getFirstValue([");
        //print array elements
        for (int i = 0; i < inputArray.size(); i++) {
            System.out.print(inputArray.get(i).toString());
            if (i != inputArray.size()-1)
                System.out.print(",");
        }

        System.out.print("]) -> ");
        System.out.println(firstValue);
        System.out.println();
    }

    private static int getFirstValue(ArrayList<Integer> inputArray) {
        return inputArray.get(0);
    }

    private static int[] getInteger(){

        Scanner sc = new Scanner(System.in);
        String inputStr;
        int[] output = new int[2];

        while (true) {
            System.out.print("Enter an integer (type 'quit' to finish): ");
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