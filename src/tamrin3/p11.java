package tamrin3;

import java.util.Scanner;

public class p11 {

    static boolean isNull1 = false;
    static boolean isNull2 = false;

    static double[] testNumber;
    static boolean isNumber1 = false;
    static boolean isNumber2 = false;
    static double userNumber1 = 0;
    static double userNumber2 = 0;

    static boolean isBool1 = false;
    static boolean isBool2 = false;
    static boolean userBool1 = false;
    static boolean userBool2 = false;

    static boolean isString1 = false;
    static boolean isString2 = false;
    static String userString1 = "";
    static String userString2 = "";


    public static void main(String[] args) {

        System.out.println("* * * * Equality Check * * * *");

        String userInput1;
        Scanner sc = new Scanner((System.in));

        //Get first input
        System.out.println("Enter first input: ");
        userInput1 = sc.nextLine();

        testFirstInput(userInput1);

        //Get second input
        String userInput2;
        System.out.println("Enter second input: ");
        userInput2 = sc.nextLine();

        testSecondInput(userInput2);

        checkEquality(userInput1, userInput2);

    }

    private static void checkEquality(String userInput1, String userInput2) {

        System.out.print("checkEquality(" + userInput1 + "," + userInput2 + ") -> ");

        if (isNull1 && isNull2){
            System.out.println("true");
            return;
        }
        if (isNumber1 && isNumber2){
            if(userNumber1 == userNumber2){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
            return;
        }
        if (isBool1 && isBool2){
            if(userBool1 == userBool2){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
            return;
        }
        if (isString1 && isString2){
            if(userString1.equals(userString2)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
            return;
        }
        //None of above
        System.out.println("false");
    }

    public static double[] isNumber(String input) {
        double inputNumber;
        double[] output = new double[2];

        try {
            inputNumber = Double.parseDouble(input);
            output[0] = 1;
            output[1] = inputNumber;
        } catch (NumberFormatException e) {
            output[0] = 0;
        }
        return output;
    }

    public static void testFirstInput(String userInput) {

        //Test for null
        if (userInput.isEmpty()) {
            isNull1 = true;
            return;
        }

        //Test for Number
        testNumber = isNumber(userInput);
        if (testNumber[0] == 1) {
            isNumber1 = true;
            userNumber1 = testNumber[1];
            return;
        }

        //Test for boolean
        switch (userInput.trim().toLowerCase()) {
            case "true":
                isBool1 = true;
                userBool1 = true;
                break;
            case "false":
                isBool1 = true;
                userBool1 = false;
                break;
            default:
                isBool1 = false;
        }
        if (isBool1)
            return;

        //String Actions
        isString1 = true;
        userString1 = userInput;
    }

    public static void testSecondInput(String userInput) {
        //Test for null
        if (userInput.isEmpty()) {
            isNull2 = true;
            return;
        }

        //Test for Number
        testNumber = isNumber(userInput);
        if (testNumber[0] == 1) {
            isNumber2 = true;
            userNumber2 = testNumber[1];
            return;
        }

        //Test for boolean
        switch (userInput.trim().toLowerCase()) {
            case "true":
                isBool2 = true;
                userBool2 = true;
                break;
            case "false":
                isBool2 = true;
                userBool2 = false;
                break;
            default:
                isBool2 = false;
        }
        if (isBool2)
            return;

        //String Actions
        isString2 = true;
        userString2 = userInput;
    }
}