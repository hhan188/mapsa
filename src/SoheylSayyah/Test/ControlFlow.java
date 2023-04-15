package SoheylSayyah.Test;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Age");
        int age = scanner.nextInt();
        System.out.println("Please Enter Your Gender");
        String gender = scanner.next();
        if (gender.equalsIgnoreCase("male")){
            System.out.println("You Are Male");
        }else {
            System.out.println("You Are Female");
        }
        if (age < 10){
            System.out.println("You Are a Kid");
        }
        if (age >= 10 && age <= 18){
            System.out.println("You Are a Teenager");
        }
        if (age > 18 && age < 40){
            System.out.println("You Are Young");
        }
        if (age >= 40 && age <= 75){
            System.out.println("You Are a Middle Age");
        }
        if (age > 75){
            System.out.println("You Are Old :(");
        }
    }
}
