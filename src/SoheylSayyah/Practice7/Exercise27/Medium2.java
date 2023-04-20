package SoheylSayyah.Practice7.Exercise27;

import java.util.Scanner;

public class Medium2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Grade : ");
        int grade = scanner.nextInt();
        String check = grade >= 60 ? "Pass" : "Fail";
        System.out.println(check);
    }
}