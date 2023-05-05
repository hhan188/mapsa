package tamrin9.interfaces.p2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BasicCalculator calc = new BasicCalculator();

        Scanner sc = new Scanner(System.in);

        System.out.println(" * * * BasicCalculator * * *");

        System.out.print("Enter first number: ");
        Double firstNumber = sc.nextDouble();

        System.out.print("Enter second number: ");
        Double secondNumber = sc.nextDouble();

        System.out.print("Enter operator (+ - * /): ");
        String operator = sc.next().trim();

        double result;

        switch (operator){
            case "+":
                result = calc.add(firstNumber,secondNumber);
                break;
            case "-":
                result = calc.subtract(firstNumber,secondNumber);
                break;
            case "*":
                result = calc.multiply(firstNumber,secondNumber);
                break;
            case "/":
                result = calc.divide(firstNumber,secondNumber);
                break;
            default:
                System.out.println("\nInvalid operator entered!!!");
                result = 0;
                break;
        }

        System.out.println("Result is: " + result);
    }
}
