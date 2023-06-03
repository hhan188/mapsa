package SoheylSayyah.Practice15.Exercise7;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your First Number :");
        String firstNumber = scanner.nextLine();
        System.out.println("Please Enter Your Second Number :");
        String secondNumber = scanner.nextLine();
        System.out.println("Please Enter Your Function :");
        String function = scanner.nextLine();
        operation(firstNumber,secondNumber,function);
    }
    public static void operation(String firstNumber,String secondNumber,String function){
        switch (function){
            case "add":
                System.out.println("***********************************************************");
                System.out.println(Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber));
                break;
            case "subtract":
                System.out.println("***********************************************************");
                System.out.println(Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber));
                break;
            case "divide":
                System.out.println("***********************************************************");
                System.out.println(Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber));
                break;
        }
    }
}
