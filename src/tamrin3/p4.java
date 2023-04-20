package tamrin3;

import java.util.Scanner;

public class p4 {

    final static byte chickensLegs = 2;
    final static byte cowsLegs = 4;
    final static byte pigsLegs = 4;

    public static void main(String[] args) {
        System.out.println("* * * * The Farm Problem * * * *");
        System.out.println();


        int[] getNum;
        int numOfChickens;
        int numOfCows;
        int numOfPigs;

        while (true) {
            System.out.println("Type 'quit' to exit program");

            getNum = getNumberOfAnimals("Enter the number of chickens: ");
            if (getNum[1] == -1)
                return;
            numOfChickens = getNum[0];

            getNum = getNumberOfAnimals("Enter the number of cows: ");
            if (getNum[1] == -1)
                return;
            numOfCows = getNum[0];

            getNum = getNumberOfAnimals("Enter the number of pigs: ");
            if (getNum[1] == -1)
                return;
            numOfPigs = getNum[0];

            //calculate and print number of legs
            animals(numOfChickens, numOfCows, numOfPigs);
        }
    }

    private static void animals(int numOfChickens, int numOfCows, int numOfPigs) {
        int totalNumOfLegs = numOfChickens * chickensLegs + numOfCows * cowsLegs + numOfPigs * pigsLegs;
        System.out.println("animals(" + numOfChickens + "," + numOfCows + "," + numOfPigs + ") -> " + totalNumOfLegs);
    }

    private static int[] getNumberOfAnimals(String prompt) {

        Scanner sc = new Scanner(System.in);
        String inputStr;
        int[] output = new int[2];

        while (true) {
            System.out.print(prompt);
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
            if (output[0] < 0) {
                System.err.println("Enter a positive integer number");
                continue;
            }
            break;
        }
        return output;
    }

}