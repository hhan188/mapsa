package Prac9.Interface.P2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number!");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("What should I do with these?");
        switch (sc.next()) {
            case "a" -> {
                System.out.println(calculator.add(a, b));
            }
            case "s" -> {
                System.out.println(calculator.subtract(a, b));
            }
            case "m" -> {
                System.out.println(calculator.multiply(a, b));
            }
            case "d" -> {
                System.out.println(calculator.divide(a, b));
            }
        }
    }
}
